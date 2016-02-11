package _5Package;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComboDemo {

	JFrame frame;
	JComboBox box;
	JTextArea area;
	JScrollPane scroll;
	Container c;
	public ComboDemo() {
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		c = frame.getContentPane();
		
		box = new JComboBox();
		box.addItem("Green");
		box.addItem("Blue");
		box.addItem("Red");
		box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = (String) box.getSelectedItem();
				area.append(text + "\n");
				
				if(e.getSource() == "Green")
					c.setBackground(Color.GREEN);
				else if(e.getSource() == "Blue")
					c.setBackground(Color.BLUE);
				else if(e.getSource() == "Red")
					c.setBackground(Color.red);
			}
		});
		
		area = new JTextArea(5, 15);
		scroll = new JScrollPane(area, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		frame.add(box);
		frame.add(scroll);
		
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ComboDemo();
	}
}
