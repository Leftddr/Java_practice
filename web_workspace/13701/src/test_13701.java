import java.util.ArrayList;
import java.util.Scanner;

public class test_13701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0 ; i < input.length ; i++)
			arr.add(Integer.parseInt(input[i]));
		
		for(int i = 0 ; i < arr.size() - 1 ; i++) {
			int cri = arr.get(i);
			for(int j = i + 1 ; j < arr.size(); j++) {
				if(cri == arr.get(j)) {arr.remove(j); j--;}
			}
		}
	
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.print(arr.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

}
