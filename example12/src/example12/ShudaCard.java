package example12;

public class ShudaCard {
	private int num;
	private boolean isKwang;
	ShudaCard(){
		this.num=1;
		this.isKwang=true;
	}
	ShudaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	int getNum() {
		return this.num;
	}
	boolean getKwang() {
		return this.isKwang;
	}
	void setNum(int num) {
		this.num=num;
	}
	void setKwang(boolean Kwang) {
		this.isKwang=Kwang;
	}
	public String toString() {
		return num+(isKwang?"K":"");
	}
	
}
