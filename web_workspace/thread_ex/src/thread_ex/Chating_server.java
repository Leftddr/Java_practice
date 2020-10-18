package thread_ex;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Chating_server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		try {
			server = new ServerSocket(10002);
			HashMap<String, Object> hm = new HashMap<String, Object>();
			while(true) {
				System.out.println("Waiting for Connection");
				Socket sock = server.accept();
				ChatThread chatThread = new ChatThread(sock, hm);
				chatThread.run();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(server != null)
						server.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
