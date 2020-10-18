import java.util.ArrayList;
import java.util.Scanner;

public class test_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			arr.add(sc.nextLine());
		}
		
		for(int i = 0 ; i < arr.size() - 1; i++) {
			for(int j = i + 1 ; j < arr.size() ; j++) {
				if(arr.get(i).length() > arr.get(j).length()) {
					String tmp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, tmp);
				}
				else if(arr.get(i).length() == arr.get(j).length()) {
					int compare = arr.get(i).compareTo(arr.get(j));
					if(compare > 0) {
						String tmp = arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, tmp);
					}
				}
			}
		}
		
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
