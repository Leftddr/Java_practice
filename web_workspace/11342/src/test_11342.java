import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test_11342 {

	static int arr[][];
	static int min_dis = 99999;
	static int cri[];
	static int max = 0;
	static int walk = 1, car = 1;
	static String[] input3 = null;
	static String[] input2 = null;
	static int car_num_ = -1;
	static boolean car_use_ = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = null;
		try {
			input1 = br.readLine().split(" ");
			input2 = br.readLine().split(" ");
			input3 = br.readLine().split(" ");
			max = Integer.parseInt(input1[0]);
			cri = new int[max];
			walk = Integer.parseInt(input1[3]);
			car = Integer.parseInt(input1[4]);
			arr = new int[Integer.parseInt(input1[0])][Integer.parseInt(input1[0])];
			
			for(int i = 0 ; i < Integer.parseInt(input1[0]) ; i++) {
				String[] input4 = br.readLine().split(" ");
				for(int j = 0 ; j < input4.length ; j++) {
					if(Integer.parseInt(input4[j]) != 0) 
						arr[i][j] = Integer.parseInt(input4[j]);
					else 
						arr[i][j] = 99999;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int start = 0, next = Integer.parseInt(input3[0]);
		int total = 0;
		
		for(int i = 0 ; i < input3.length ; i++) {
			dfs(start, next, 0, false, -1);
			if(car_use_) {
				input2[car_num_] = "-1";
			}
			total += min_dis;
			System.out.println(start + " " + next + " " + min_dis);
			car_use_ = false;
			car_num_ = -1;
			min_dis = 99999;
			if(i + 1 >= input3.length) break;
			start = Integer.parseInt(input3[i]);
			next = Integer.parseInt(input3[i + 1]);
		}
		dfs(next, 0, 0, false, -1);
		total += min_dis;
		
		System.out.println(total);
	}
	public static void dfs(int cur, int target, int total, boolean car_use, int car_num) {
		if(cur == target && total < min_dis) {
			min_dis = total;
			if(car_use) {
				car_num_ = car_num;
				car_use_ = true;
			}
			else car_use_ = false;
		}
		else {
			for(int i = 0 ; i < max ; i++) {
				if(i == cur)continue;
				if(cri[i] == 1 || arr[cur][i] == 0) continue;
				cri[i] = 1;
				
				if(car_use) {
					total += car * arr[cur][i];
					dfs(i, target, total, car_use, car_num);
					total -= car * arr[cur][i];
				}
				
				else {
					for(int j = 0 ; j < input2.length ; j++) {
						if(cur == Integer.parseInt(input2[j])) {
							total += car * arr[cur][i];
							dfs(i, target, total, true, j);
							total -= car * arr[cur][i];
						}
					}
						total += walk * arr[cur][i];
						dfs(i, target, total, false, -1);
						total -= walk * arr[cur][i];
				}
				cri[i] = 0;
			}
		}
	}
}
