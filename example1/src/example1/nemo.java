package example1;

public class nemo {
	int a;
	int b;
	int c;
	nemo(int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double size() {
		int s=(this.a+this.b+this.c)/2;
		int temp1=s-this.a;
		int temp2=s-this.b;
		int temp3=s-this.c;
		if(s*temp1*temp2*temp3<0) {System.out.println("wrong number\n");return 0;}
		else {
		double size=Math.sqrt(s*temp1*temp2*temp3);
		return size;
		}
	}
	void get() {
		if(a==b && b==c) {
			System.out.println("Á¤»ï°¢Çü");		
		}
		else if((a*a+b*b==c*c)||(b*b+c*c==a*a)||(c*c+a*a==b*b)) {
			System.out.println("Á÷°¢»ï°¢Çü");
		}
		else {
			System.out.println("±×³É »ï°¢Çü");
		}
	}
}
