package example12;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		ShutDeck ex=new ShutDeck();
		ex.shuffle();
		for(int i=0;i<ex.CARD_NUM;i++) {
			System.out.println(ex.shuda[i].getNum()+" "+ex.shuda[i].getKwang());
			if(i==10) {System.out.println("\n");}
		}
		System.out.println(num);
	}

}
