package _06_duck;

public class Animal_Runner { public static void main(String[] args) {
	
	Duck daffy = new Duck("donuts",5);

	daffy.quack();
	
	daffy.waddle();
	
	Dog billy = new Dog("ball", true);
	
	billy.woof();
	
	billy.wag();
	
}

}
