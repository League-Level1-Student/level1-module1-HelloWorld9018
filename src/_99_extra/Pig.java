package _99_extra;

public class Pig {
	private String name;
    private boolean isSheepHerder;
     
    public Pig(String name, boolean canHerdSheep) {   //  write code here

this.name= name;
this.isSheepHerder = canHerdSheep;



    }
    public boolean willBecomeBacon() {
        if(this.isSheepHerder)
            return false;
        else 
            return true;
        }
    }


