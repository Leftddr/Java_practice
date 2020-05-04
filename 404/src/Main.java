
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1=new Account(1000);
		Account ac2=new Account(2000);
		Account ac3=new Account(3000);
		ac3.getTotalBalance();
		ac2.getbalance();
		Account.getTotalBalance();
	}

}

class Account{
	private static int totalbalance=0;
	private int balance=0;
	public Account(int deposit) {
		this.balance+=deposit;
		totalbalance+=this.balance;
	}
	public static void getTotalBalance() {
		System.out.println("totalbalance "+totalbalance);
	}
	public void getbalance() {
		System.out.println("balance : "+this.balance);
	}
}
