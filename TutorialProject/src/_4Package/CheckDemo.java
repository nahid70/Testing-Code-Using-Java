package _4Package;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckDemo extends JFrame implements ItemListener{

	JTextField field;
//	JCheckBox bold;
	JRadioButton bold, plain;
	ButtonGroup gbtn;
	public CheckDemo() {
		setLayout(new FlowLayout());
		
		field = new JTextField("change" , 30);
		bold = new JRadioButton("bold");
		plain = new JRadioButton("plain", true);
		bold.addItemListener(this);
		plain.addItemListener(this);
		
		gbtn = new ButtonGroup();
		gbtn.add(bold);
		gbtn.add(plain);
		
		add(field);
		add(bold);
		add(plain);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new CheckDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == bold){
			field.setFont(new Font("Serif", Font.BOLD, 14));
		}
		else if(e.getSource() == plain){
			field.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		
	}
}
