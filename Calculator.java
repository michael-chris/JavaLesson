import java.awt.Color;

import javax.swing.*;

public class Calculator extends JFrame{
	
    public static final int WIDTH = 600, HEIGHT = 800;
    
    private Numpad num;
    private Display dis;
    
	private String x;
	private String y;
	private String answer;
	
	public Calculator(){
		
		super("Calculator");
		
		
        this.setSize(WIDTH,HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null); 
        this.setLocationRelativeTo(null);
        
        
        this.num = new Numpad();
        this.num.setSize(Calculator.WIDTH, 3 * Calculator.HEIGHT/4);
        this.num.setBounds(0, Calculator.HEIGHT / 5, Calculator.WIDTH, 3 * Calculator.HEIGHT/4);
        this.add(num);
        
        
        this.dis = new Display();
        this.dis.setSize(Calculator.WIDTH, Calculator.HEIGHT/4);
        this.dis.setBounds(Calculator.WIDTH/20,Calculator.WIDTH/20,Calculator.WIDTH, Calculator.HEIGHT/4);
        this.add(dis);
        
        
		this.getContentPane().setBackground(Color.WHITE);
        
        
        this.setVisible(true);
        
	}
	
	
	public void addX(String x) {
		this.x += x;
	}
	
	public void addY(String y) {
		this.y += y;
	}
	
	
	public String getAnswer(String x, String y, String expres) {
		
		
		if(expres == "+") {
			this.answer = Integer.toString(Integer.parseInt(x) + Integer.parseInt(y));
			
		}
		
		
		else if(expres == "-") {
			this.answer = Integer.toString(Integer.parseInt(x) - Integer.parseInt(y));
		}
		
		
		else if(expres == "*") {
			this.answer = Integer.toString(Integer.parseInt(x) * Integer.parseInt(y));
		}
		
		
		else if(expres == "/") {
			if(y=="0")
				this.answer = "Divide by 0 Error!";
			else {
				this.answer = Integer.toString(Integer.parseInt(x) / Integer.parseInt(y));
			}

		}
		
		
		else {
			this.answer = "EXPRES WAS SOMEHOW NOTHING!";
		}
		
		
		return this.answer;
			
	}
	
	
}
