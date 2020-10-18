import java.util.ArrayList;
import java.util.Scanner;

public class test_13558 {

	static ArrayList<Integer> arr;
	static int max = -99999;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		arr = new ArrayList<Integer>();
		String[] input = sc.nextLine().split(" ");
		for(int i = 0 ; i < input.length ; i++)
			arr.add(Integer.parseInt(input[i]));
		
		for(int i = 0 ; i < arr.size() - 1 ; i++) {
			for(int j = i + 1 ; j < arr.size() ; j++) {
				int minus = arr.get(j) - arr.get(i);
				dfs(j, minus);
			}
		}
		System.out.println(count);
	}
	
	public static void dfs(int v, int minus) {
		for(int i = v + 1 ; i < arr.size(); i++) {
			if(arr.get(i) - arr.get(v) == minus) {
				count++;
			}
		}
	}
}
