import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class test_1159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> arr = new ArrayList<Character>();
		HashMap<Character, Integer> name = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i = 0 ; i < num ; i++) {
			String tmp_name = sc.nextLine();
			char ch = tmp_name.charAt(0);
			try {
				int value = name.get(ch);
				name.put(ch, value + 1);
			} catch (NullPointerException e) {
				name.put(ch, 1);
			}
		}
		
		int sum = 0;
		String result = "";
		while(sum < 5) {
			int max_num = 0;
			char tmp_result = ' ';
			for(Entry<Character, Integer> entry : name.entrySet()) {
				if(max_num < entry.getValue()) {max_num = entry.getValue(); tmp_result = entry.getKey();}
			}
			if(tmp_result != ' ') {
				arr.add(tmp_result);
				sum += max_num;
				result += tmp_result;
				name.remove(tmp_result);
			}
		}
		

		for(int i = 0 ; i < arr.size() ; i++) {
			for(int j = i + 1 ; j < arr.size() ; j++) {
				if((arr.get(i) > arr.get(j))) {
					char ch = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, ch);
				}
			}
		}
		
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.print(arr.get(i));
		}
		System.out.println();
	}

}
