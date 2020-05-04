package example4;

public class Military {
	private final String belongsTo="BitCoding Empire";
	private int soliders;
	static int totalsoliders=0;
	Military(){}
	Military(int soliders){
		this.soliders=soliders;
		totalsoliders+=soliders;
	}
	
	String getBelongsTo() {
		return this.belongsTo;
	}
	int getSoliders() {
		return soliders;
	}
	int getTotalsoliders() {
		return totalsoliders;
	}
}
