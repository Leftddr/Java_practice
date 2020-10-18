import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_13437 {

	static String[] input = null;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine().split(" ");
		arr = new int[5];
		for(int i = 0 ; i < input.length ; i++)
			arr[i] = Integer.parseInt(input[i]);
		
		int count = 0;
		for(int i = 0 ; i < arr[2] ; i++) {
			for(int j = 0 ; j < arr[3] ; j++) {
				int retval = calculate(i, j);
				if(retval == arr[4]) count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static int calculate(int x, int y) {
		int count = 8;
		if(x + arr[0] > arr[2]) count -= 2;
		if(x - arr[0] < 1) count -= 2;
		if(y + arr[1] > arr[3]) count -= 2;
		if(y - arr[1] < 1) count -= 2;
		if(x + arr[1] > arr[2]) count -= 2;
		if(x - arr[1] < 1) count -= 2;
		if(y + arr[0] > arr[3]) count -= 2;
		if(y - arr[0] < 1) count -= 2;
		return count;
	}
}

class Pair<T1, T2>{
	T1 key;
	T2 value;
	public Pair(T1 key, T2 value) {
		this.key = key; 
		this.value = value;
	}
	public T1 first() {
		return key;
	}
	public T2 second() {
		return value;
	}
}
