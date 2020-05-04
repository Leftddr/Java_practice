import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.omg.CORBA.portable.OutputStream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Client 1");
		
		ArrayList<Socket> soc = new ArrayList<Socket>();
		JSONObject job1 = new JSONObject();
		
		Socket client = null;
		try {
			client = new Socket();
			System.out.println("Login? (enter num) : ");
			int temp = sc.nextInt();
			sc.nextLine();
			
			InetAddress pingcheck = InetAddress.getByName("127.0.0.1");
			System.out.println("127.0.0.1" + ":" + pingcheck.isReachable(4000));
			//int[] arr = new int[5];
			job1.put("subject1", "hi");
			job1.put("subject2", "hello");
			JSONObject result = new JSONObject();
			result.put("result", job1);
			System.out.println(result.toJSONString());
			String input = result.toJSONString();
			
			//System.out.println(job1.toString());
			
			client.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8080));
			System.out.println("SUCCESS");
			soc.add(client);
			while(true) {
				System.out.println(" > ");
				String message = sc.nextLine();
				byte[] as = message.getBytes("UTF-8");
				OutputStream OS = (OutputStream) client.getOutputStream();
				OS.write(as);
			}
			
		}catch(Exception e) {
			System.out.println("Cannot connect to Server");
		}
		try {
			client.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
