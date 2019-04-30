import java.awt.Color;

import javax.swing.*;

public class Calculator extends JFrame{
	
    public static final int WIDTH = 600, HEIGHT = 800;
    
    private Numpad num;
    private Display dis;
    
	private int x;
	private int y;
	private int answer;
	
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
	
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public int getAnswer() {
		return answer;
	}
	
	//Adds Two numbers together and returns answer;
	public int add(int x, int y) {
		return x + y;
	}
	
	//Subtracts Two Numbers together and returns answer;
	public int sub(int x, int y) {
		return x - y;
	}
	
	//Multiplies Two numbers together and returns answer;
	public int multi(int x, int y) {
		return x * y;
	}
	
	//Divides Two Numbers Together and Returns answer, if divided by zero throws error;
	public int div(int x, int y) {
		try {
			answer = x / y;
		}
		catch (ArithmeticException ae){
			System.out.println("Divide by 0 Error!");
			return 0;
		}
		return answer;
		
	}
}
