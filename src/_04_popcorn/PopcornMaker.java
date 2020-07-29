package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker { public static void main(String[] args) {
	
	Microwave machine = new Microwave();
	
	String flav = JOptionPane.showInputDialog(null, "What flavor of popcorn would you like?");
	
	Popcorn thingTobecooked = new Popcorn(flav);
	
	
	machine.putInMicrowave(thingTobecooked);
	
	String time = JOptionPane.showInputDialog("How many minutes would you like to cook your popcorn?");
	
	int cooktime = Integer.parseInt(time);
	
	machine.setTime(cooktime);
	
	machine.startMicrowave();
}

}
