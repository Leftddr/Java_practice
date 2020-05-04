import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;

public class ThreadServer extends Thread{

	Socket server;
	int id;
	
	ThreadServer(Socket server2, int id){
		this.server = server2;
		this.id = id;
	}
	@Override
	public void run() {
		try {
			while(true) {
				InputStream is = (InputStream) server.getInputStream();
				byte[] bt = new byte[256];
				int size = is.read(bt);
				
				String output = new String(bt, 0, size, "UTF-8");
				System.out.println(id + ">" + output);
			}
		} 
		catch(IOException e) {
			System.out.println("--" + id + "user out");
		}
	}
}

class connectThread extends Thread{
	ServerSocket mss;
	int count = 1;
	
	connectThread(ServerSocket mss){
		this.mss = mss;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Socket server = mss.accept();
				System.out.println("--" + count + " user login");
				ThreadServer server = new ThreadServer(server, count);
				server.start();
				count++;
			}
		}
	}
	
}