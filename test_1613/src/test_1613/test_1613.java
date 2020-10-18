package test_1613;

import java.util.ArrayList;

public class test_1613 {
	static int map[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		map = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			input = sc.nextLine().split(" ");
			int t1 = Integer.parseInt(input[0]);
			int t2 = Integer.parseInt(input[1]);
			map[t1 - 1][t2 - 1] = 1;
			map[t2 - 1][t1 - 1] = -1;
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == j) continue;
				if(map[i][j] == 0) continue;
				for(int k_ = 0 ; k_ < n ; k_++) {
					if(i == j) continue;
					if(map[i][j] == -1 && map[j][k_] == -1) {
						map[i][k_] = -1;
					}
					if(map[i][j] == 1 && map[j][k_] == 1) {
						map[i][k_] = 1;
					}
				}
			}
		}
		
		int query = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < query ; i++) {
			input = sc.nextLine().split(" ");
			int t1 = Integer.parseInt(input[0]);
			int t2 = Integer.parseInt(input[1]);
			System.out.println(map[t1 - 1][t2 - 1]);
		}
		*/
		
		ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
		arr.add(new Pair<>(1, 5));
		arr.add(new Pair<>(2, 4));
		System.out.println(arr.get(0).first());
		System.out.println(arr.get(0).<Integer>add());
	}

}
