package example3;

public class Warrior extends Character {
	Warrior(String name,int Hp, int Mp, int ST, int DX, int IQ, int LX){
		super(name,Hp,Mp,ST,DX,IQ,LX);
	}
	double acc() {
		return (double)(Math.random()*(0.5+0.01*LX))+1.0+0.01*LX;
	}
	void attack(Character c) {
		double temp=(4*ST+DX+IQ)*acc();
		c.Hp-=temp;
	}
	void skill(Character c) {
		double temp=8*ST*acc();
		Mp-=10;
		c.Hp-=temp;
	}
	void status() {
		if(Hp<=0) {System.out.println("Die");}
		else {
		System.out.println("Hp" + Hp + "Mp" + Mp);
	}
	}
}
