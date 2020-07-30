package _99_extra;

public class Candy {
	private String maker;		//e.g. Hershey’s, Willy Wonka
    private boolean isChocolatey;
    private double price;    
    
    public Candy (String maker, boolean isChocolatey, double price) {
    	this.maker = maker;
    	this.isChocolatey= isChocolatey;
    	this.price= price;
    }
    
    String getMaker() {
    	return maker;
    }
    
    boolean getChocolate(){
    	return isChocolatey;
    }
    
    double getPrice() {
    	return price;
    }
    
}
    

