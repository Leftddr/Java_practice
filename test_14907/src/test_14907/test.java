package test_14907;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	//일을 끝마친것을 구분하기 위한 변수
	static String complete = "";
	//시작한것을 구분하기 위한 변수
	static String start = "";
	static ArrayList<String[]> arr = new ArrayList<>();
	static ArrayList<Integer> work_time = new ArrayList<>();
	static String start_work;
	static int start_time;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 6 ; i++) {
			String input[] = sc.nextLine().split(" ");
			if(input.length >= 3) {
				String push[] = {input[0], input[2]};
				arr.add(push);
				work_time.add(Integer.parseInt(input[1]));
			}
			else {
				start_work = input[0];
				start_time = Integer.parseInt(input[1]);
			}
		}
		
		int time = start_time;
		complete += start_work;
		
		while(true) {
			if(complete.length() == arr.size() + 1) break;
			//시작해도 되는것을 구분하기 위한 코드
			for(int i = 0 ; i < arr.size(); i++) {
				int match = 0;
				for(int j = 0 ; j < arr.get(i)[1].length() ; j++) {
					for(int k = 0 ; k < complete.length(); k++) {
						if(arr.get(i)[1].charAt(j) == complete.charAt(k)) {
							match++;
						}
					}
				}
				if(match == arr.get(i)[1].length()) {
					start += arr.get(i)[0];
					arr.get(i)[1] = "-";
				}
			}
			
			//끝내기 위한 코드
			for(int i = 0 ; i < start.length(); i++) {
				for(int j = 0 ; j < arr.size(); j++) {
					if(arr.get(j)[0].charAt(0) == start.charAt(i)) {
						if(work_time.get(j) == 0) continue;
						int tmp_time = work_time.get(j);
						work_time.set(j, tmp_time - 1);
						if(tmp_time - 1 == 0) {
							complete += arr.get(j)[0];
						}
						break;
					}
				}
			}
			time++;
		}
		
		System.out.println(time);
	}
}
