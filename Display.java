import javax.swing.JTextArea;

public class Display extends JTextArea{
	
	public Display(){
		this.setSize(Calculator.WIDTH,Calculator.HEIGHT/5);
	    this.setEditable(false);
	    this.setFocusable(false);
	    this.setFont(this.getFont().deriveFont(90.0f));
	    this.setText("Pee Pee");
	}
    
	public void inputExpres(String expres) {
		this.setText("");
		this.append(expres);
		
	}
	
}