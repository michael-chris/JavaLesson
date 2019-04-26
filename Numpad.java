import java.awt.Color;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.*;


public class Numpad extends JPanel{
	
    public static final int WIDTH = (4 * Calculator.WIDTH/5), HEIGHT = ( 3 * Calculator.HEIGHT/4);
	
	private ArrayList<JButton> numbers;
	
	
	private JButton one,two,three,four,five,six,seven,eight,nine,plus,sub,mult,div,dec,enter;
	
	private GridBagConstraints gbc;
	 
	public Numpad() {
		
		this.numbers = new ArrayList<JButton>();
		
        this.setLayout(null);
        this.setSize(4 * Calculator.WIDTH/5, 3 * Calculator.HEIGHT/4);
        this.setBounds(0, Calculator.HEIGHT / 5, 4 * Calculator.WIDTH / 5, 3 * Calculator.HEIGHT / 4);
        this.setBackground(Color.BLACK);
		
    	JButton button;

        int k = 9;
    	
        //Might be easier to read if it is a while loop
        for(int i = 0; i < 4; i++) {
        	for(int j = 2; j >= 0; j--) {
	        	button = new JButton("" + k);
	        	button.setSize( Numpad.WIDTH / 3, Numpad.HEIGHT / 4);
	        	button.setBounds( ((j%3) * Numpad.WIDTH) / 3, ((i%4) * Numpad.HEIGHT) / 4, Numpad.WIDTH / 3, Numpad.HEIGHT / 4);
		        this.numbers.add(button);
		        this.add(button);
		        System.out.println("I suck dik");
		        k--;
	        	if(k < 0) {
	        		break;
	        	}
        	}
        	if(k < 0) {
        		break;
        	}
        }
        
        button = new JButton("=");
        
        
        button = new JButton("0");
        
        button = new JButton(".");
		
		
	}
	
}
