package example4;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Military mili=new Military(50);
		Army army=new Army(50,50,50);
		AirForce airforce=new AirForce(50,50,50);
		Navy navy=new Navy(50,50,50);
		Military mili2=new Military(50);
		System.out.println(Military.totalsoliders);
	}

}
