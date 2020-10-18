package test_2960;

import java.util.ArrayList;
import java.util.Scanner;

public class test_2960 {
	static int n, k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		String input[] = sc.nextLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		for(int i = 0 ; i <= n ; i++) {
			arr.add(i);
		}
		
		int cnt = 0;
		
		for(int i = 2 ; i < arr.size() ; i++) {
			if(arr.get(i) == -1) continue;
			int num = arr.get(i);
			if(is_prime(num)) {
				arr.set(num, -1);
				cnt++;
				if(cnt == k) {
					System.out.println(num);
					return;
				}
				int multi = 2;
				while(true) {
					if(num * multi > n) break;
					if(arr.get(num * multi) == -1) {
						multi++;
						continue;
					}
					arr.set(num * multi, -1);
					cnt++;
					if(cnt == k) {
						System.out.println(num * multi);
						return;
					}
					multi++;
				}
			}
		}
	}
	
	static boolean is_prime(int num) {
		int end_num = (int)Math.sqrt(num);
		for(int i = 2 ; i <= end_num ; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

}
