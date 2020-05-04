package practice3;
import java.util.Scanner;

public class GirlGroup {
	String name;
	String[] str;
	int num;
	GirlGroup(){
		this.name="never";
		this.str=null;
		this.num=0;
	}
	GirlGroup(String name,int num){
		this.name=name;
		this.str=new String[num];
		this.num=num;
	}
	void set() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<this.num;i++) {
			String girlname=sc.nextLine();
			str[i]=girlname;
		}
	}
}
