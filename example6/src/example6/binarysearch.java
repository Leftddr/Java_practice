package example6;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={0,1,2,3,4,5,6,7,8,9};
		binary bin=new binary();
		bin.bs_recursive(a, 5, 0, 9);
		bin(new int[] {0,1,2,3,4,5});
	}
	
	public static int bin(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		return 0;
	}

}
