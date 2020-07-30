package _06_duck;

public class Duck {



	private int numberOfFriends;
	private String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;      
 }

	void quack() {
		System.out.println("What's you favorite food: " + favoriteFood);
	}
	
	void waddle() {
		System.out.println("How many friends do you have: " + numberOfFriends);
	}
	
}
