
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestClick{
	public static void main(String[] args){
		TestClickMan man =new TestClickMan();
	}
}

class TestClickMan{
	JFrame frame;
	JButton button;
	JTextField fileName;
	JPanel fieldPanel;

	public TestClickMan(){
		frame =new JFrame("TestClick");
		frame.setLocation(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button =new JButton("Click me!");
		button.addActionListener(this);
		
	}

}









