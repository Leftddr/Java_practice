package example3;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character adv=new Character("j",2000,30,25,10,10,10);
		Warrior war=new Warrior("K",2000,100,100,40,20,25);
		Archer arc=new Archer("T",1000,120,40,120,40,30);
		Wizard wiz=new Wizard("B",100,300,20,20,150,10);
		
		adv.attack(war);
		adv.attack(arc);
		adv.attack(wiz);
		war.skill(adv);
		arc.skill(adv);
		wiz.skill(war);
		
		for (int i=0;i<5;i++) {
			war.attack(wiz);
		}
		adv.status();
		war.status();
		arc.status();
		wiz.status();
		String simple="simple";
		System.out.println(simple.charAt(2));
		System.out.println(simple.length());
	}

}
