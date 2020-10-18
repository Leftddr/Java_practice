package test_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class test_2023 {
	static int n;
	static ArrayList<String> res;
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		ArrayList<String> arr = new ArrayList<>();
		res = new ArrayList<>();
		arr.add("2"); arr.add("3"); arr.add("5"); arr.add("7");
		
		for(int i = 0 ; i < arr.size(); i++) {
			dfs(arr.get(i));
		}
		
		for(int i = 0 ; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

	static void dfs(String number) {
		for(int i = 0 ; i < 10 ; i++) {
			if(i % 2 == 0) continue;
			String tmp = number + Integer.toString(i);
			if(is_prime(Integer.parseInt(tmp))) {
				if(tmp.length() == n) {
					res.add(tmp);
					continue;
				}
				dfs(tmp);
			}
		}
	}
	
	static boolean is_prime(int num) {
		int end_num = (int)Math.sqrt(num);
		for(int i = 2 ; i < end_num ; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
