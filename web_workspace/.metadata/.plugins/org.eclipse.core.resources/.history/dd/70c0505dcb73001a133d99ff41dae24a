import java.util.ArrayList;
import java.util.Scanner;

public class test_6132 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		
		for(int i = 0 ; i < Integer.parseInt(input[0]) ; i++) {
			arr.add(Integer.parseInt(sc.nextLine()));
		}
		
		int c = Integer.parseInt(input[1]);
		
		int max_cost = 0;
		
		for(int i = 1 ; i < arr.size() ; i++) {
			max_cost += Math.abs(arr.get(i - 1) - arr.get(i));
		}
		
		max_cost *= c;
		
		for(int i = 0 ; i < arr.size() ; i++) {
			int cost = 99999;
			boolean left = false;
			boolean right = false;
			if(i - 1 >= 0) {
				cost += Math.abs(arr.get(i) - arr.get(i - 1)) * c;
				left = true;
			}
			if(i + 1 < arr.size()) {
				cost += Math.abs(arr.get(i) - arr.get(i + 1)) * c;
				right = true;
			}
			int cur = 0;
			int result_cur = 0;
			while(true) {
				if(left && right) {
					if(arr.get(i) + cur > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) break;
				}
				else if(!left && right) {
					if(arr.get(i) + cur > arr.get(i + 1)) break;
				}
				else if(left && !right) {
					if(arr.get(i) + cur > arr.get(i - 1)) break;
				}
				
				if(left && right) {
					int tmp_cost = cur * cur + (Math.abs(arr.get(i) + cur - arr.get(i - 1)) + Math.abs(arr.get(i) + cur - arr.get(i + 1)) * c);
					if(tmp_cost < cost) {
						cost = tmp_cost;
						result_cur = cur;
					}
				}
				else if(!left && right) {
					int tmp_cost = cur * cur + Math.abs(arr.get(i) + cur - arr.get(i + 1)) * c;
					if(tmp_cost < cost) {
						cost = tmp_cost;
						result_cur = cur;
					}
					
				}
				else if(left && !right) {
					int tmp_cost = cur * cur + Math.abs(arr.get(i) + cur - arr.get(i - 1)) * c;
					if(tmp_cost < cost) {
						cost = tmp_cost;
						result_cur = cur;
					}
				}
				cur++;
			}
			int tmp = arr.get(i);
			arr.remove(i);
			arr.add(i, tmp + result_cur);
		}
		
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.print(arr.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

}
