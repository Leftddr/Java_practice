import java.util.ArrayList;

public class test_1189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String, Integer> v1 = new Vector<String, Integer>();
		v1.add("hello", 12); v1.add("bye", 13);
		System.out.println(v1.getFirst(0));
	}

}

class Vector<T1, T2>{
	private ArrayList<T1> arr1 = new ArrayList<T1>();
	private ArrayList<T2> arr2 = new ArrayList<T2>();
	
	public void add(T1 num1, T2 num2) {
		arr1.add(num1); arr2.add(num2);
	}
	
	public T1 getFirst(int index) {
		if(index >= arr1.size()) {
			System.out.println("Index Out of Bounds");
			return null;
		}
		else {
			return arr1.get(index);
		}
	}
	
	public T2 getSecond(int index) {
		if(index >= arr2.size()) {
			System.out.println("Index Out of Bounds");
			return null;
		}
		else {
			return arr2.get(index);
		}
	}
}