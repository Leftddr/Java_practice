import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr1 = sc.nextLine().split(" ");
		String[] arr2 = sc.nextLine().split(" ");
		ArrayList<Integer> arr1_ = new ArrayList<Integer>();
		ArrayList<Integer> arr2_ = new ArrayList<Integer>();
		for(int i = 0; i<arr1.length;i++)
			arr1_.add(Integer.parseInt(arr1[i]));
		for(int i = 0; i<arr2.length;i++)
			arr2_.add(Integer.parseInt(arr2[i]));
		
		Integer[] final_arr1 = arr1_.toArray(new Integer[arr1_.size()]);
		Integer[] final_arr2 = arr2_.toArray(new Integer[arr2_.size()]);
		
		Arrays.sort(final_arr2);
		if(final_arr1[0] <= final_arr1[1]) {
			System.out.println(final_arr2[final_arr2.length - 3]);
		}
		else {
			int cri = 0;
			int max_length = -99999;
			for(int i = 1; i < final_arr2[final_arr2.length - 1]; i++) {
				int count = 0;
				for(int j = final_arr2.length - final_arr1[1] ; j < final_arr2.length; j++) {
					if(final_arr2[j] >= i) {count++;}
					if(final_arr2[j] - i >= i) {count++;}
				}
				if(count >= final_arr1[0]) {
					if(max_length < i) {max_length = i; cri = 1;}
				}
			}
			if(cri == 0) {System.out.println("-1");}
			else {System.out.println(max_length);}
		}
	}

}
