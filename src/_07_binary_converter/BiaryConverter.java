package _07_binary_converter;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BiaryConverter { 
	
	void popUp() {
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	 
	frame.setVisible(true);
	
	frame.setTitle(" Convert 8 bits of binary to ASCII");
	
	//frame.setPreferredSize(new Dimension(400, 100));
	
	 frame.add(panel);
	 
	 JTextField answer = new JTextField(20);
	 
	 panel.add(answer);
	 
	 frame.pack();
	 
	}
}


