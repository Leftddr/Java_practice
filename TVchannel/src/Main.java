
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV_Control Tv = new TV_Control();
		Tv.channelDown();
		Tv.goToChannel(12);
		System.out.println(Tv.getChannel());
		System.out.println(Tv instanceof TV_Control);
	}

}
