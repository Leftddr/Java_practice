package test_1863;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class test_1863 {
	static Comparator<Pair> comparator;
	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Pair> pos = new ArrayList<>();
		make_compare();
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			int x, y;
			String input[] = sc.nextLine().split(" ");
			x = Integer.parseInt(input[0]);
			y = Integer.parseInt(input[1]);
			pos.add(new Pair(x, y));
		}
		
		Collections.sort(pos, comparator);
		
		int building = 0;
		int bottom = 1;
		int cur_y = 1;
		for(int i = 0 ; i < pos.size() ; i++) {
			if(cur_y < pos.get(i).value) {
				if(cur_y == 0 && pos.get(i).value == 1)
						building--;
				building++;
			}
			else {
				if(pos.get(i).value == 0 && i != pos.size() - 1)
					bottom++;
			}
			cur_y = pos.get(i).value;
		}
		
		System.out.println(building +  bottom);
	}
	
	static void make_compare() {
		comparator = new Comparator<Pair>() {
			@Override
			public int compare(Pair a, Pair b) {
				return a.key - b.key;
			}
		};
	}

}
