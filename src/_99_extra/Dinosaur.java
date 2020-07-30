package _99_extra;

public class Dinosaur {
	private String species;

    private boolean carniverous;

    private int yearExtinct;
    
    public Dinosaur(String species, boolean carniverous, int yearExtinct) {
    	
    	this.species = species;
    	this.carniverous= carniverous;
    	this.yearExtinct = yearExtinct;
    	
    	
    	
    }
    
    String getSpecies() {
    	return species;
    }
    
    boolean getCarniverous() {
    	return carniverous;
    }
    
    int getYearExtinct() {
    	return yearExtinct;
    }

}
