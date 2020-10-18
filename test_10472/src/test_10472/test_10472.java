package test_10472;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_10472 {
	//0은 흰색, 1은 검은색;
	static String target = "000000000";
	static String origin = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for(int i = 0 ; i < 3 ; i++) {
			String input = sc.nextLine();
			for(int j = 0 ; j < input.length() ; j++) {
				if(input.charAt(j) == '*') {
					origin += "1";
				}
				else {
					origin += "0";
				}
			}
		}
		
		Queue<String> q = new LinkedList<>();
		Queue<Integer> count = new LinkedList<>();
		HashSet<String> s = new HashSet<>();
		
		q.add(origin);
		count.add(0);
		s.add(origin);
		
		while(q.size() != 0) {
			StringBuilder arr = new StringBuilder(q.poll());
			int tmp_count = count.poll();
			
			if(check(arr.toString())) {
				System.out.println(tmp_count);
				break;
			}
			
			StringBuilder tmp_arr;
			for(int i = 0 ; i < 9 ; i++) {
				tmp_arr = arr;
				if(i - 3 >= 0) {
					if(tmp_arr.charAt(i - 3) == '0') tmp_arr.setCharAt(i - 3, '1');
					else tmp_arr.setCharAt(i - 3, '0');
				}
				if(i - 1 >= 0) {
					if(tmp_arr.charAt(i - 1) == '0') tmp_arr.setCharAt(i - 1, '1');
					else tmp_arr.setCharAt(i - 1, '0');
				}
				if(i + 1 < 9) {
					if(tmp_arr.charAt(i + 1) == '0') tmp_arr.setCharAt(i + 1, '1');
					else tmp_arr.setCharAt(i + 1, '0');
				}
				if(i + 3 < 9) {
					if(tmp_arr.charAt(i + 3) == '0') tmp_arr.setCharAt(i + 3, '1');
					else tmp_arr.setCharAt(i + 3, '0');
				}
				
				
				if(s.add(tmp_arr.toString()) == false) continue;
				System.out.println(tmp_arr.toString());
				q.add(tmp_arr.toString());
				count.add(tmp_count + 1);
			}
		}
		System.out.println("End");
	}
	
	static boolean check(String arr) {
		for(int i = 0 ; i < 9 ; i++) {
			if(arr.charAt(i) != target.charAt(i)) return false;
		}
		return true;
	}

}
