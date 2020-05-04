package example6;

public class binary {
	public static int bs_recursive(int[] array, int k, int start, int end) {
		if(start>end) return -1;
		int mid =(start+end)/2;
		if(k==array[mid]) {System.out.println("find\n");return mid;}
		if(k<array[mid]) {
			return bs_recursive(array,k,start,mid-1);
		}
		if(k>array[mid]) {
			return bs_recursive(array,k,mid+1,end);
		}
		return -1;
	}
}
