package test_1613;

public class Pair <T1, T2> {
	private T1 num1;
	private T2 num2;
	
	Pair(T1 num1, T2 num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T1 first() {
		return this.num1;
	}
	
	public T2 second() {
		return this.num2;
	}
	
	public <T> T1 add() {
		return this.num1; 
	}
}
