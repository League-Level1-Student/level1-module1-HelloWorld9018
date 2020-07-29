package _02_cat;

public class Cat_Runner {public static void main(String[] args) {
	
	Cat kitty = new Cat("Billy");
	
	kitty.meow();
	
	
	
	kitty.printName();
	
	for(int i = 9; i>0; i--) {
		
		kitty.kill();
		
	}
	
}

}
