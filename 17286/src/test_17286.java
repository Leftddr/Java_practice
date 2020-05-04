import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class test_17286 {
	static int[][] pos = new int[4][2];
	static int[] cri = new int[4];
	static int row = 4;
	static int col = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < row ; i++) {
			String[] input = sc.nextLine().split(" ");
			for(int j = 0 ; j < col ; j++) {
				pos[i][j] = Integer.parseInt(input[j]);
			}
		}
		ArrayList<int[]> arr = new ArrayList<int[]>();
		int[] arr_ = new int[5];
		arr.add(arr_);
		arr_ = new int[10];
		arr.add(arr_);
		System.out.println(arr.get(0)[4]);
		System.out.println(arr.get(1)[9]);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		Object[] objs = v.toArray();
		Arrays.sort(objs);
		int count = 0;
		int start_x = pos[0][0];
		int start_y = pos[0][1];
		cri[0] = 1;
		double total = 0;
		while(count < row - 1) {
			double min_dis = 99999;
			int temp_index = -1;
			for(int i = 0; i < row; i++) {
				if(cri[i] == 1) {continue;}
				double dis = Math.sqrt((Math.pow(start_x - pos[i][0], 2) + Math.pow(start_y - pos[i][1], 2)));
				if(min_dis > dis) {min_dis = dis; temp_index = i;}
			}
			cri[temp_index] = 1;
			total += min_dis;
			start_x = pos[temp_index][0]; start_y = pos[temp_index][1];
			count++;
		}
		System.out.println(total);
	}

}
