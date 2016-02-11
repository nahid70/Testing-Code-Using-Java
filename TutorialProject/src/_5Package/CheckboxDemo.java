package _5Package;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckboxDemo extends JFrame {

	JTextField field;
	public CheckboxDemo() {

		setLayout(null);
		
		field = new JTextField
				("Changing text");
		setBounds(20, 30, 200, 30);
		
		add(field);
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CheckboxDemo();
	}
}
