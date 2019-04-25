import javax.swing.*;

public class Calculator extends JFrame{
	private int x;
	private int y;
	private int answer;
	
	//public int getX();
	
	
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
