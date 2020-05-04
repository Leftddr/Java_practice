package example3;

public class Archer extends Character {
	Archer(String name,int Hp, int Mp, int ST, int DX, int IQ, int LX){
		super(name,Hp,Mp,ST,DX,IQ,LX);
	}
	double acc() {
		return (double)(Math.random()*(0.7+0.01*LX))+1.0+0.01*LX;
	}
	void attack(Character c) {
		double temp=(ST+2*DX+IQ)*acc();
		c.Hp-=temp;
	}
	void skill(Character c) {
		double temp=4*DX*acc();
		Mp-=30;
		c.Hp-=temp;
	}
	void status() {
		if(Hp<=0) {System.out.println("Die");}
		else {
		System.out.println("Hp" + Hp + "Mp" + Mp);
	}
	}
	
}
