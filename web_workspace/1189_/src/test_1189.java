import java.util.Scanner;

public class test_1189 {

	static char[][] arr;
	static int r, c, k;
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		r = Integer.parseInt(input[0]); c = Integer.parseInt(input[1]);
		arr = new char[r][c];
		for(int i = 0 ; i < r ; i++) {
			String tmp = sc.nextLine();
			for(int j = 0 ; j < c ; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		k = Integer.parseInt(input[2]); 
		dfs(r - 1, 0, 0);
		System.out.println(result);
	}
	
	public static void dfs(int x, int y, int sum) {
		if(x == 0 && y == c - 1 && sum == k - 1) {
			result++;
			return;
		}
		arr[x][y] = 'x';
		if(x - 1 >= 0 && arr[x - 1][y] == '.') {
			dfs(x - 1, y, sum + 1);
		}
		if(x + 1 < r && arr[x + 1][y] == '.') {
			dfs(x + 1, y, sum + 1);
		}
		if(y - 1 >= 0 && arr[x][y - 1] == '.') {
			dfs(x, y - 1, sum + 1);
		}
		if(y + 1 < c && arr[x][y + 1] == '.') {
			dfs(x, y + 1, sum + 1);
		}
		arr[x][y] = '.';
	}

}
