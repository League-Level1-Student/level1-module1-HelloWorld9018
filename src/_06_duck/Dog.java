package _06_duck;

public class Dog {

	private String favoriteToy;
	private Boolean likeDoggytreat;

	Dog(String favoriteToy, Boolean likeDoggytreat){
		
		this.favoriteToy = favoriteToy;
		this.likeDoggytreat = likeDoggytreat;
		
	}
	
	void woof(){
		System.out.println("What's your favorite toy: " + favoriteToy);
	}
	
	void wag() {
		System.out.println("Do you like doggy treats: " + likeDoggytreat);
	}
	
}
