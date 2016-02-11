package _3package;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CDemo extends JFrame {
	JComboBox<String> combo;
	JTextArea area;
	JScrollPane scroll;
	Container c;
	public CDemo() {
		setLayout(new FlowLayout());
		c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.addItem("Green");
		combo.addItem("Blue");
		combo.addItem("Red");
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = (String) combo.getSelectedItem();
				area.append(text +"\n");
				if(text.equals("Green")){
					c.setBackground(Color.GREEN);
					}
				else if(text.equals("Red"))
					c.setBackground(Color.RED);
				else if(text.equals("Blue"))
					c.setBackground(Color.BLUE);
				
			}
		});
		area = new JTextArea(5, 20);
		scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		scroll.add(area);
		
		add(combo);
		add(scroll);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,400);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new CDemo();
	}
}
