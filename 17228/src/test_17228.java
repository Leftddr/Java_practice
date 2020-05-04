import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class test_17228 {
	static char[][] arr;
	static int[][] cri;
	static ArrayList<Vector> list = new ArrayList<Vector>();
	static String result;
	static int final_result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		arr = new char[num][num];
		cri = new int[num][num];
		
		for(int i = 0 ; i < num - 1 ; i++) {
			String[] input = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(input[0]);
			int num2 = Integer.parseInt(input[1]);
			arr[num1 - 1][num2 - 1] = input[2].charAt(0);
		}
		result = sc.nextLine();
		int pos = 0;
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				if(cri[i][j] == 1) {continue;}
				if(arr[i][j] != result.charAt(pos)) {continue;}
				cri[i][j] = 1;
				dfs(j, pos + 1, num);
				cri[i][j] = 0;
			}
		}
		
		System.out.println(final_result);
	}
	
	public static void dfs(int node, int pos, int num) {
		if(pos >= result.length()) {
			final_result++;
			return;
		}
		else {
			for(int i = 0 ; i < num ; i++) {
				if(cri[node][i] == 1) {continue;}
				if(arr[node][i] != result.charAt(pos)) {continue;}
				cri[node][i] = 1;
				dfs(i, pos + 1, num);
				cri[node][i] = 0;
			}
		}
	}

}
