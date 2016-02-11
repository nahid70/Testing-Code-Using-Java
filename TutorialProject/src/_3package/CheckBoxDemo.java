package _3package;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CheckBoxDemo extends JFrame implements ItemListener{
	Container c;
	JTextField text;
	JCheckBox boldBox, italicBox;
	private JLabel lblBackground;
	public CheckBoxDemo() {
		c = getContentPane();
		c.setBackground(Color.BLACK);
		setLayout(null);
//		lblBackground = new JLabel(new ImageIcon(getClass().getResource(
//				"quranImage.gif")));

		text = new JTextField("Changing font style ");
		add(text).setBounds(100, 30, 200, 20);
		
		boldBox = new JCheckBox("bold");
		italicBox = new JCheckBox("italic");
		boldBox.setBackground(Color.BLACK);
		boldBox.setForeground(Color.white);
		italicBox.setBackground(Color.black);
		italicBox.setForeground(Color.white);
		boldBox.addItemListener(this);
		italicBox.addItemListener(this);
		add(boldBox).setBounds(120, 70, 50, 20);
		add(italicBox).setBounds(200, 70, 80, 20);
//		add(lblBackground).setBounds(0, 0, 400, 400);
		
	}
	public static void main(String[] args) {
		CheckBoxDemo area = new CheckBoxDemo();
		area.setDefaultCloseOperation(EXIT_ON_CLOSE);
		area.setVisible(true);

		area.setSize(400, 400);
		area.setLocationRelativeTo(null);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == boldBox) {
			text.setFont(new Font("Blackadder ITC", Font.BOLD, 14));
		}
		if(e.getSource() == italicBox){
			text.setFont(new Font("Blackadd67er ITC", Font.ITALIC, 14));

		}
		
		
	}
}
