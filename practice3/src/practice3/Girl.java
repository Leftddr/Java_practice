package practice3;
import java.util.Scanner;

public class Girl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int num1=str.charAt(0)-'0';
		int num2=str.charAt(2)-'0';
		
		GirlGroup[] girl=new GirlGroup[num1];
		
		for(int i=0;i<num1;i++) {
			String groupname=sc.nextLine();
			int girlnum=sc.nextInt();
			girl[i]=new GirlGroup(groupname,girlnum);
			girl[i].set();
		}
	}
}
