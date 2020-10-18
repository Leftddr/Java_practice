import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class EchoServer {

	private static final String EXIT = "EXIT";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Selector selector = Selector.open();
			ServerSocketChannel serverSocket = ServerSocketChannel.open();
			serverSocket.bind(new InetSocketAddress("localhost", 3000));
			serverSocket.configureBlocking(false);
			serverSocket.register(selector, SelectionKey.OP_ACCEPT);
			ByteBuffer buffer = ByteBuffer.allocate(256);
			
			while(true) {
				selector.select();
				Set<SelectionKey> selectedKeys = selector.selectedKeys();
				Iterator<SelectionKey> iter = selectedKeys.iterator();
				while(iter.hasNext()) {
					SelectionKey key = iter.next();
					if(key.isAcceptable()) {
						register(selector, serverSocket);
					}
					if(key.isReadable()) {
						answerWithEcho(buffer, key);
					}
					iter.remove();
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void answerWithEcho(ByteBuffer buffer, SelectionKey key) {
		try {
			SocketChannel client = (SocketChannel) key.channel();
			client.read(buffer);
			if(new String(buffer.array()).trim().equals(EXIT)) {
				client.close();
				System.out.println("Not accepting client messages anymore");
			}
			buffer.flip();
			client.write(buffer);
			buffer.clear();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void register(Selector selector, ServerSocketChannel serverSocket) {
		try {
			SocketChannel client = serverSocket.accept();
			client.configureBlocking(false);
			client.register(selector, SelectionKey.OP_READ);
			System.out.println("new client connected...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
