package example3;

public class Wizard extends Character{
	
	Wizard(String name,int Hp, int Mp, int ST, int DX, int IQ, int LX){
		super(name,Hp,Mp,ST,DX,IQ,LX);
	}
	double acc() {
		return (double)(Math.random()*(0.3+0.3*LX))+1.0+0.3*LX;
	}
	void attack(Character c) {
		double temp=(2*DX+4*IQ)*acc();
		c.Hp-=temp;
	}
	void skill(Character c) {
		double temp=10*IQ*acc();
		Mp-=50;
		c.Hp-=temp;
	}
	void status() {
		if(Hp<=0) {System.out.println("Die");}
		else {
		System.out.println("Hp" + Hp + "Mp" + Mp);
	}
	}

}
