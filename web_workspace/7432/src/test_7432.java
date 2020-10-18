import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class test_7432 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> arr = new ArrayList<String[]>();
		int num = Integer.parseInt(sc.nextLine());
		int max_len = -99999;
		for(int i = 0 ; i < num ; i++) {
			String[] input = sc.nextLine().split("/");
			arr.add(input);
			if(max_len < input.length) max_len = input.length;
		}
		
		ArrayList<Vector<String>> result = new ArrayList<Vector<String>>();
		
		for(int i = 0 ; i < max_len ; i++) {
			
		}
	}

}
