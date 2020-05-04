import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_1135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < input.length ; i++)
			arr.add(Integer.parseInt(input[i]));
		
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		int[] cri = new int[arr.size()];
		int[][] temp1 = new int[arr.size()][2];
		
		int level = 0;
		
		temp2.add(0);
		
		for(int i = 0 ; i < temp2.size(); i++) {
			int count = 0;
			for(int j = 0 ; j < arr.size(); j++) {
				if(temp2.get(i) == arr.get(j)) count++;
			}
			temp1[temp2.get(i)][0] = level;
			temp1[temp2.get(i)][1] = count;
		}
		
		while(true) {
			
			ArrayList<Integer> index = new ArrayList<Integer>();
			
			for(int i = 0 ; i < temp2.size() ; i++) {
				int count = 0;
				if(cri[temp2.get(i)] == 1) {continue;}
				cri[temp2.get(i)] = 1;
				for(int j = 0 ; j < arr.size() ; j++) {
					if(temp2.get(i) == arr.get(j)) {
						count++;
						index.add(j);
					}
				}
				
				temp1[temp2.get(i)][0] = level;
				temp1[temp2.get(i)][1] = count;
			}
			
			temp2.clear();
			temp2 = index;
			
			int num = 0;	
			for(int i = 0 ; i < cri.length ; i++) {
				if(cri[i] != 1) {num = 1; break;}
			}
			if(num == 0) {break;}
			
			level++;
		}
		
		int result = 0;
		
		for(int i = 0 ; i < arr.size() ; i++) {
			int min = 99999;
			for(int j = 0 ; j < arr.size() ; j++) {
				if(i == temp1[j][0] && temp1[j][1] < min) {
					min = temp1[j][1];
				}
			}
			if(min != 99999)
				result += min;
		}
		System.out.println(result);
	}
}
