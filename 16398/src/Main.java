import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer[]> array;
	static int[][] map;
	static int[] cri;
	static int min_cost = 99999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array = new ArrayList<Integer[]>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		cri = new int[num];
		
		map = new int[num][num];
		for(int i = 0; i < num; i++) {
			String[] arr1 = sc.nextLine().split(" ");
			for(int j = 0 ; j<num;j++) {
				map[i][j] = Integer.parseInt(arr1[j]);
			}
		}
		int cnt = 0;
		int cost = 0;
		for(int i = 0; i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i == j) {continue;}
				if(cri[j] == 1) {continue;}
				cri[i] = 1;
				cost += map[i][j];
				dfs(j, cnt + 1 ,num, cost);
				cri[i] = 0;
				cost -= map[i][j];
			}
		}
		System.out.println(min_cost);
	}
	
	public static void dfs(int v, int cnt, int num, int cost) {
		if(cnt == num) {
			if(min_cost > cost) {min_cost = cost;}
		}
		else {
			for(int i = 0; i < num; i++) {
				if(cri[i] == 1) {continue;}
				if(i == v) {continue;}
				cri[i] = 1;
				cost += map[v][i];
				dfs(i, cnt + 1, num, cost);
				cost -= map[v][i];
				cri[i] = 0;
			}
		}
	}
}

