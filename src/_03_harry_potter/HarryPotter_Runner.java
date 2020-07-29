package _03_harry_potter;

public class HarryPotter_Runner { public static void main(String[] args) {
	
	HarryPotter wizard = new HarryPotter();
	
	wizard.makeInvisible(true);
	
	wizard.spyOnSnape();
	
	wizard.makeInvisible(false);
	
	wizard.castSpell("abracadabra");
}

}
