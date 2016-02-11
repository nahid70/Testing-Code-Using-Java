package _3package;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class chDemo extends JFrame implements ItemListener{
	JTextField field;
	JRadioButton box1, box2, box3, box4;
	ButtonGroup b;
	public chDemo() {
		setLayout(null);
		field = new JTextField("Changing");
		box1 = new JRadioButton("bold");
		box2 = new JRadioButton("italic");
		box3 = new JRadioButton("Plain");
		box4 = new JRadioButton("bold/italic");
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		box4.addItemListener(this);
		b = new ButtonGroup();
		b.add(box1);
		b.add(box2);
		b.add(box3);
		b.add(box4);
		
		add(field).setBounds(40, 20, 200, 30);
		add(box1).setBounds(40, 60, 60, 30);
		add(box2).setBounds(120, 60, 60, 30);
		add(box3).setBounds(200, 60, 60, 30);
		add(box4).setBounds(280, 60, 90, 30);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new chDemo();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == box1)
			field.setFont(new Font("Serif", Font.BOLD, 14));
		else if(e.getSource() == box2)
			field.setFont(new Font("Serif", Font.ITALIC, 14));
		else if(e.getSource() == box3)
			field.setFont(new Font("Serif", Font.PLAIN, 14));

		else if(e.getSource() == box4)
			field.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));

		
	}
}
