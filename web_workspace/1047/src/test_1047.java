import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test_1047 {
	static ArrayList<int[][]> arr1 = new ArrayList<int[][]>();
	static ArrayList<int[]> arr2 = new ArrayList<int[]>();
	static int min_x = 99999;
	static int max_x = -99999;
	static int min_y = 99999;
	static int max_y = -99999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		int[][] temp1 = new int[num][2];
		Integer[] temp2 = new Integer[num];
		
		for(int i = 0 ; i < num ; i++) {
			String[] input = sc.nextLine().split(" ");
			temp1[i][0] = Integer.parseInt(input[0]);
			temp1[i][1] = Integer.parseInt(input[1]);
			temp2[i] = Integer.parseInt(input[2]);
			
			if(min_x > temp1[i][0]) {min_x = temp1[i][0];}
			if(max_x < temp1[i][0]) {max_x = temp1[i][0];}
			if(min_y > temp1[i][1]) {min_y = temp1[i][1];}
			if(max_y < temp1[i][1]) {max_y = temp1[i][1];}
		}
		
		int total_length = ((max_x - min_x) + (max_y - min_y)) * 2;
		
		Arrays.sort(temp2, Collections.reverseOrder());
		
		int result = 0;
		int total = 0;
		
		for(int i = 0 ; i < temp2.length ; i++) {
			result++;
			total += temp2[i];
			if(total >= total_length) { System.out.println(result); return;}
		}
		
	}

}
