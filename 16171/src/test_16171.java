import java.util.Scanner;

public class test_16171 {
	static String str1;
	static String str2;
	static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		arr=new int[str2.length()];
		
		for(int i=0;i<str2.length();i++)
			arr[i]=-1;
		int count=0;
		for(int i=0;i<str2.length();i++) {
			
			for(int j=0;j<str1.length();j++) {
				if(str2.charAt(i)==str1.charAt(j)) {arr[count++]=j;}
			}
			
			for(int j=0;j<count;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println("\n");
			
			for(int j=0;j<count-1;j++) {
				for(int k=arr[j]+1;k<arr[j+1];k++) {
					if(str1.charAt(k)<'0' || str1.charAt(k)>'9') {System.out.println("a"+0);return;}
				}
				if(arr[j+1]<arr[j]) {System.out.println("b"+0);return;}
			}
			
		}
		System.out.println(1);
	}

}
