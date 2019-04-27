import java.awt.Color;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class Numpad extends JPanel{
	
    public static final int WIDTH = (4 * Calculator.WIDTH/5), HEIGHT = ( 3 * Calculator.HEIGHT/4);
	
	private ArrayList<JButton> numbers;
	private ArrayList<String> buttonNames;
	
	
	private GridBagConstraints gbc;
	 
	public Numpad() {
		
		this.numbers = new ArrayList<JButton>();
		this.buttonNames = new ArrayList<String>();
		for(int i = 9 ; i > 0; i--) {
			this.buttonNames.add("" + i);
		}
		this.buttonNames.add("=");
		this.buttonNames.add(".");
		this.buttonNames.add("0");
		
        this.setLayout(null);
        this.setSize(4 * Calculator.WIDTH/5, 3 * Calculator.HEIGHT/4);
        this.setBounds(0, Calculator.HEIGHT / 5, 4 * Calculator.WIDTH / 5, 3 * Calculator.HEIGHT / 4);
        this.setBackground(Color.BLACK);
		
    	JButton button;

        int k = 0;
    	
        for(int i = 0; i < 4; i++) {
        	for(int j = 2; j >= 0; j--) {
	        	button = new JButton(this.buttonNames.get(k));
	        	button.setSize( Numpad.WIDTH / 3, Numpad.HEIGHT / 4);
	        	button.setBounds( ((j%3) * Numpad.WIDTH) / 3, ((i%4) * Numpad.HEIGHT) / 4, Numpad.WIDTH / 3, Numpad.HEIGHT / 4);
		        this.numbers.add(button);
		        this.add(button);
		        k++;
        	}
        }
		
	}
	
	
	
}
