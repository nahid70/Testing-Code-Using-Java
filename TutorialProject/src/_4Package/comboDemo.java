package _4Package;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class comboDemo extends JFrame implements ActionListener{

	JComboBox box;
	JTextArea area;
	public comboDemo() {
		
		
		setLayout(new FlowLayout());
		
		box = new JComboBox();
		box.addItem("Red                      ");
		box.addItem("Green");
		box.addItem("Blue");
		box.addItem("Black");
		box.addActionListener(this);
		
		area = new JTextArea(4, 30);
		
		add(box);
		add(new JScrollPane(area));
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new comboDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = (String) box.getSelectedItem();
		area.append("\n" +text);
	}
}
