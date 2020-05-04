package example2;

public class Pitcher extends BaseballPlayer {
	int ballSpeed;
	Pitcher(int x){
		this.ballSpeed=x;
	}
	void traning() {
		this.ballSpeed+=1;
	}
	boolean vsBatter(Batter p) {
		double temp1=super.stamina+0.5*ballSpeed;
		double temp2=super.stamina+2*p.contact;
		if(temp1 > temp2) {
			return true;
		}
		else return false;
	}
}
