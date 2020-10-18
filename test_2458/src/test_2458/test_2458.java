package test_2458;

import java.util.Scanner;

public class test_2458 {
	static int map[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		map = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			input = sc.nextLine().split(" ");
			map[Integer.parseInt(input[0]) - 1][Integer.parseInt(input[1]) - 1] = 1;
		}
		
		//이부분은 기억하자!!! 다른 연결 요소를 계속해서 연결해 주는 것
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == j) continue;
				if(map[i][j] != 1) continue;
				for(int k = 0 ; k < n ; k++) {
					if(j == k) continue;
					if(map[i][j] == 1 && map[j][k] == 1) {
						map[i][k] = 1;
					}
				}
			}
		}
		
		int res = 0;
		
		for(int i = 0 ; i < n ; i++) {
			int sum = 0;
			for(int j = 0 ; j < n ; j++) {
				if(map[i][j] == 1) sum++;
				else if(map[j][i] == 1) sum++;
			}
			if(sum == n - 1) res++;
		}
		
		System.out.println(res);
	}

}
