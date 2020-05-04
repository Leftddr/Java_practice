package example3;

public class Character {
	String name;
	int Hp;
	int Mp;
	int ST;
	int DX;
	int IQ;
	int LX;
	Character(){}
	Character(String name,int Hp, int Mp, int ST, int DX, int IQ, int LX){
		this.name=name;
		this.Hp=Hp;
		this.Mp=Mp;
		this.ST=ST;
		this.DX=DX;
		this.IQ=IQ;
		this.LX=LX;
	}
	double acc() {
		return (double)(Math.random()*(1+0.01*LX))+0.5+0.01*LX;
	}
	void attack(Character C) {
		double temp=(this.ST+this.DX+this.IQ)*this.acc();
		C.Hp-=temp;
	}
	void status() {
		if(Hp<=0) {System.out.println("Die");}
		else {
		System.out.println("Hp" + Hp + "Mp" + Mp);
	}
	}
}
