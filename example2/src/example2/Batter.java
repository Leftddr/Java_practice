package example2;

public class Batter extends BaseballPlayer {
	int contact;
	Batter(int x){
		this.contact=x;
	}
	void traning() {
		contact+=2;
	}
	boolean vsPitcher(Pitcher p) {
		double temp1=super.stamina+2*contact;
		double temp2=super.stamina+0.5*p.ballSpeed;
		if(temp1 > temp2) {
			return true;
		}
		else return false;
	}
}
