import java.util.Scanner;
import java.util.Vector;

public class test_15816 {
	static Vector<Integer> vector =  new Vector<Integer>();
	static int num;
	static int query;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		num = Integer.parseInt(sc.next());
		sc.nextLine();
		
		String[] input = sc.nextLine().split(" ");
		for(int i = 0 ; i < input.length ; i++) {
			vector.add(Integer.parseInt(input[i]));
		}
		
		query = Integer.parseInt(sc.next());
		sc.nextLine();
		
		for(int i = 0 ; i < query ; i++) {
			String[] temp = sc.nextLine().split(" ");
			int temp_query = 0;
			
			try {
				temp_query = Integer.parseInt(temp[0]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			if(temp_query == 1) {
				int temp_num = Integer.parseInt((temp[1]));
				for(int j = 0 ; j < vector.size() ; j++) {
					if(vector.get(j) == temp_num) {continue;}
				}
				vector.add(temp_num);
			}
			else if(temp_query == 2) {
				int min = Integer.parseInt(temp[1]);
				int max = Integer.parseInt(temp[2]);
				if(min == max) {System.out.println("0"); continue;}
				int count = max - min + 1;
				for(int j = 0 ; j < vector.size() ; j++) {
					if(vector.get(i) >= min && vector.get(i) <= max) {count--;}
				}
				System.out.println(count);
			}
			else {
				System.out.println("Wrong Number");
			}
		}
	}

}
