import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class test_17493 {
	static int[][] map;
	static int[] cri;
	static int[] cri2;
	static int row;
	static int edge;
	//static Pair<Integer, Integer> p = new Pair<>
	//static ArrayList<int[][]> arr;
	static int[][] arr;
	static int min_k = -99999;
	static int result = 99999;
	static Vector<Integer> v;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		row = Integer.parseInt(input[0]);
		edge = Integer.parseInt(input[1]);
		
		//arr = new ArrayList<int[][]>();
		arr = new int[edge][2];
		map = new int[row][row];
		cri = new int[row];
		cri2 = new int[row];
		v = new Vector<Integer>();
		
		for(int i = 0 ; i < edge ; i++) {
			String[] temp = sc.nextLine().split(" ");
			int temp1 = Integer.parseInt(temp[0]);
			int temp2 = Integer.parseInt(temp[1]);
			arr[i][0] = temp1; arr[i][1] = temp2;
		}
		
		for(int i = row ; i >= 1 ; i--) {
			int cnt = 0;
			//if(i > result) {break;}
			for(int j = 0 ; j < row ; j++) {
				if(cri2[j] == 1) {continue;}
				cri2[j] = 1;
				cri[j]++;
				v.add(j);
				fill(j);
				dfs(i, cnt + 1);
				empty(j);
				v.remove(v.size() - 1);
				cri2[j] = 0;
				cri[j]--;
			}
		}
		
		System.out.println(result + " " + min_k);
	}
	
	public static void dfs(int max_, int cnt) {
		//if(max_ > result) {return;}
		if(cnt >= max_) {
			int sum = 0;
			for(int i = 0 ; i < row ; i++)
				if(cri[i] >= 1) {sum++;}
			if(sum >= min_k && max_ < result) {
				result = max_; min_k = sum;
				for(int i = 0 ; i < v.size() ; i++)
					System.out.print(v.get(i));
				System.out.println();
			}
		}
		else {
			for(int i = 0 ; i < row ; i++) {
				if(cri2[i] == 1) {continue;}
				cri2[i] = 1;
				cri[i]++;
				v.add(i);
				fill(i);
				dfs(max_, cnt + 1);
				empty(i);
				cri2[i] = 0;
				cri[i]--;
				v.remove(v.size() - 1);
			}
		}
	}
	
	public static void empty(int num) {
		for(int i = 0 ; i < edge ; i++) {
			if(arr[i][0] == num) {cri[arr[i][1] - 1]--;}
			else if(arr[i][1] == num) {cri[arr[i][0] - 1]--;}
		}
	}
	
	public static void fill(int num) {
		for(int i = 0 ; i < edge ; i++) {
			if(arr[i][0] == num) {cri[arr[i][1] - 1]++;}
			else if(arr[i][1] == num) {cri[arr[i][0] - 1]++;}
		}
	}

}
