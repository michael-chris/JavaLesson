import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class Numpad extends JPanel{
	
    public static final int WIDTH = Calculator.WIDTH, HEIGHT = ( 3 * Calculator.HEIGHT/4);
	
	private ArrayList<JButton> buttons;
	private ArrayList<String> buttonNames;
	
	
	private GridBagConstraints gbc;
	 
	public Numpad() {
		
		this.buttons = new ArrayList<JButton>();

		this.buttonNames = new ArrayList<String>();
		
		this.buttonNames.add("*");
		for(int i = 9 ; i > 0; i--) {
			if(i == 6) {
				this.buttonNames.add("/");
			}
			if(i == 3) {
				this.buttonNames.add("-");
			}
			this.buttonNames.add("" + i);
		}
		this.buttonNames.add("+");
		this.buttonNames.add("=");
		this.buttonNames.add("0");
		this.buttonNames.add("Clear");

		
        this.setLayout(null);
        this.setSize(Calculator.WIDTH, 3 * Calculator.HEIGHT / 4);
        this.setBounds(0, Calculator.HEIGHT / 5, Calculator.WIDTH, 3 * Calculator.HEIGHT / 4);
        this.setBackground(Color.BLACK);
		
    	JButton button;

        int k = 0;
    	
        for(int i = 0; i < 4; i++) {
        	for(int j = 3; j >= 0; j--) {
	        	button = new JButton(this.buttonNames.get(k));
	        	button.setSize( Numpad.WIDTH / 4, Numpad.HEIGHT / 4);
	        	button.setBounds( ((j%4) * Numpad.WIDTH) / 4, ((i%4) * Numpad.HEIGHT) / 4, Numpad.WIDTH / 4, Numpad.HEIGHT / 4);
		        this.buttons.add(button);
		        this.add(button);
		        k++;
        	}
        }
		
	}
	
	public  void setListener(ActionListener a) {
		for(int i = 0; i < 16; i++) {
			this.buttons.get(i).addActionListener(a);
		}
	}
	
	
	
}
