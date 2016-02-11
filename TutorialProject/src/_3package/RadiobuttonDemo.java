package _3package;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadiobuttonDemo extends JFrame implements ItemListener{
	Container c;
	JTextField text;
	JRadioButton boldBtn, italicBtn, plainBtn, BIBtn;
	ButtonGroup groupBtn;
	
	
	public RadiobuttonDemo() {
		c = getContentPane();
		c.setBackground(Color.BLACK);
		setLayout(new FlowLayout());

		text = new JTextField("Changing font style ", 30);
		add(text);

		boldBtn = new JRadioButton("bold", false);
		plainBtn = new JRadioButton("plain", true);
		BIBtn = new JRadioButton("bold & italic", false);
		italicBtn = new JRadioButton("italic", false);
		groupBtn = new ButtonGroup();
		
		boldBtn.setBackground(Color.BLACK);
		boldBtn.setForeground(Color.white);
		
		plainBtn.setBackground(Color.BLACK);
		plainBtn.setForeground(Color.white);
		
		BIBtn.setBackground(Color.BLACK);
		BIBtn.setForeground(Color.white);
		
		italicBtn.setBackground(Color.black);
		italicBtn.setForeground(Color.white);
		boldBtn.addItemListener(this);
		
		BIBtn.addItemListener(this);
		
		plainBtn.addItemListener(this);
		
		italicBtn.addItemListener(this);
		add(plainBtn);
		add(boldBtn);
		add(italicBtn);
		add(BIBtn);
		
		groupBtn.add(plainBtn);
		groupBtn.add(boldBtn);
		groupBtn.add(italicBtn);
		groupBtn.add(BIBtn);
		
		
	}
	public static void main(String[] args) {
		RadiobuttonDemo area = new RadiobuttonDemo();
		area.setDefaultCloseOperation(EXIT_ON_CLOSE);
		area.setVisible(true);

		area.setSize(400, 400);
		area.setLocationRelativeTo(null);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == boldBtn) {
			text.setFont(new Font("Serif", Font.BOLD, 14));
			
		}
		else if(e.getSource() == italicBtn){
			text.setFont(new Font("Serif", Font.ITALIC, 14));
			}
		
		else if(e.getSource() == plainBtn){
			
			text.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		
		else if(e.getSource() == BIBtn){
			text.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));
		}
	}
}
