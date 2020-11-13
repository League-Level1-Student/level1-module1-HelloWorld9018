package _99_extra;

public class Practice_Runner { 
	
	static Pig piggy = new Pig("Babe", false);
	
	public static void main(String[] args) {
	
	Dinosaur dino = new Dinosaur("TRex", true, 1000);
	
	System.out.println(dino.getSpecies());
	System.out.println(dino.getCarniverous());
	System.out.println(dino.getYearExtinct());
	
	WhiteBoardMarker marker = new WhiteBoardMarker(95, "Blue");
	
	System.out.println(marker.getInkLeft());
	System.out.println(marker.getColor());
	
	Candy yum = new Candy("Snickers", true, 1.99);
	
	System.out.println(yum.getMaker());
	System.out.println(yum.getChocolate());
	System.out.println(yum.getPrice());
	
	//Pig piggy = new Pig("Babe", false);
	System.out.println(piggy.willBecomeBacon());
	
	breakfast();
	
	piggy = new Pig("Rasher", true);
	
	System.out.println(piggy.willBecomeBacon());
	
	breakfast();
	
	}

	static void breakfast() {
		if(piggy.willBecomeBacon() == true) {
			System.out.println("bacon for breakfast");
		}
		
		else {
			System.out.println("eggs for breakfast");
		}
	}

}


