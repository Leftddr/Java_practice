package example12;

public class ShutDeck {
	final int CARD_NUM=20;
	ShudaCard[] shuda=new ShudaCard[CARD_NUM];
	
	public void shuffle() {
		int count=0;
		for(int i=0;i<2;i++) {
			for(int j=1;j<=CARD_NUM/2;j++) {
				if(i%2!=0 && (j==1 || j==3 || j==8)) {
					shuda[count++]=new ShudaCard(j,false);
				}else {
					shuda[count++]=new ShudaCard(j,true);
				}
			}
		}
	}
	
	public int pick(int num) {
		return shuda[num].getNum();
	}
}
