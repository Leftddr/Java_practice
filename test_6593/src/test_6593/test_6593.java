package test_6593;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_6593 {
	static int l, r, c;
	static char arr[][][];
	static int start_l, start_x, start_y;
	static int target_l, target_x, target_y;
	static int global_dis = 99999;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			arr = new char[l][r][c];
			for(int i = 0 ; i < l ; i++) {
				for(int j = 0 ; j < r ; j++) {
					input = bf.readLine();
					for(int k = 0 ; k < input.length() ; k++) {
						arr[i][j][k] = input.charAt(k);
						if(input.charAt(k) == 'S') {
							start_l = i; start_x = j; start_y = k;
						}
						else if(input.charAt(k) == 'E') {
							target_l = i ; target_x = j; target_y = k;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dfs(start_l, start_x, start_y, 0);
		if(global_dis == 99999) {
			System.out.println("Trapped!!");
		}
		else {
			System.out.println(global_dis);
		}
	}
	
	static void dfs(int h, int x, int y, int dis) {
		if(h == target_l && x == target_x && y == target_y) {
			if(dis < global_dis) {
				global_dis = dis;
			}
		}
		
		arr[h][x][y] = '#';
		if(x + 1 < r && arr[h][x + 1][y] != '#') {
			dfs(h, x + 1, y, dis + 1);
		}
		
		if(y + 1 < c && arr[h][x][y + 1] != '#') {
			dfs(h, x, y + 1, dis + 1);
		}
		
		if(x - 1 >= 0 && arr[h][x - 1][y] != '#') {
			dfs(h, x - 1, y, dis + 1);
		}
		
		if(y - 1 >= 0 && arr[h][x][y - 1] != '#') {
			dfs(h, x, y - 1, dis + 1);
		}
		
		if(h + 1 < l && arr[h + 1][x][y] != '#') {
			dfs(h + 1, x, y, dis + 1);
		}
		
		if(h - 1 >= 0 && arr[h - 1][x][y] != '#') {
			dfs(h - 1, x, y, dis + 1);
		}
		arr[h][x][y] = '.';
		
	}

}
