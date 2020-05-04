package example2;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer base=new BaseballPlayer("leebongwon",20,300);
		Batter batter=new Batter(5);
		Pitcher pitcher=new Pitcher(21);
		System.out.println(batter.vsPitcher(pitcher));
		System.out.println(pitcher.vsBatter(batter));
	}

}
