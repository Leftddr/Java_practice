import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

class UserThread extends Thread{
	Socket user;
	int id;
	
	UserThread(Socket user, int id){
		this.user = user;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(user.getInputStream()));
			PrintWriter pw = new PrintWriter(user.getOutputStream());
			
			String readData = "";
			while(!(readData = br.readLine()).equals(null)) {
				System.out.println(readData);
			}
			pw.println("OK!!");
			pw.flush();
		} catch(IOException e) {
			System.out.println("-- SERVER CLOSE --");
		}
	}
}

class connectThread extends Thread{
	ServerSocket server;
	int count = 1;
	
	connectThread(ServerSocket server){
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Socket ss = this.server.accept();
				System.out.println("--" + count + " user login");
				UserThread ust = new UserThread(ss, count);
				ust.start();
				count++;
			}
		} catch (IOException e) {
			System.out.println("-- SERVER CLOSE --");
		}
	}
}

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), 4000));
			System.out.println("--SERVER Close : input num");
			System.out.println("--SERVER Waiting...");
			connectThread th = new connectThread(serverSocket);
			th.start();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			serverSocket.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
