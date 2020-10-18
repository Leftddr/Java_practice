import java.util.Scanner;

public class test_13565 {

	static int[][] arr;
	static int row = 0;
	static int col = 0;
	static boolean reach = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		arr = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
		row = Integer.parseInt(input[0]); col = Integer.parseInt(input[1]);
		for(int i = 0 ; i < Integer.parseInt(input[0]) ; i++) {
			String[] tmp = sc.nextLine().split(" ");
			for(int j = 0 ; j < tmp.length ; j++)
				arr[i][j] = Integer.parseInt(tmp[j]);
		}
		
		for(int i = 0 ; i < col ; i++) {
			if(arr[0][i] == 0) {
				dfs(0, i);
			}
			if(reach) {break;}
		}
		System.out.println(reach);
		if(!reach)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
	
	public static void dfs(int x, int y) {
		if(reach) return;
		if(x == row - 1) reach = true;
		else {
			//System.out.println(x + " " + y);
			if(x + 1 <= row - 1 && arr[x + 1][y] == 0) {
				arr[x + 1][y] = 1;
				dfs(x + 1, y);
				arr[x + 1][y] = 0;
			}
			if(y + 1 <= col - 1 && arr[x][y + 1] == 0) {
				arr[x][y + 1] = 1;
				dfs(x, y + 1);
				arr[x][y + 1] = 0;
			}
			if(y - 1 >= 0 && arr[x][y - 1] == 0) {
				arr[x][y - 1] = 1;
				dfs(x, y - 1);
				arr[x][y - 1] = 0;
			}
		}
	}
}
