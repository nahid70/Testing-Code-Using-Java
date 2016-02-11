package _3package;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComboDemo extends JFrame implements ActionListener{
	JComboBox<String> box ;
	JTextArea area ;

	public ComboDemo() {
		box = new JComboBox<String>();
		box.addItem("Select one of the item");
		box.addItem("Red");
		box.addItem("Green");
		box.addItem("Blue");
		box.addItem("Black");
		box.addItem("Gray");
		box.addActionListener(this);
		setLayout(new FlowLayout());
		
		area = new JTextArea(5,30);
		
		
		add(box);
		add(new JScrollPane(area, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER 
				));
	}
	public static void main(String[] args) {
		ComboDemo combo = new ComboDemo();
		combo.setDefaultCloseOperation(EXIT_ON_CLOSE);
		combo.setVisible(true);
		combo.setSize(400, 400);
		combo.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = (String) box.getSelectedItem();
		area.append("\n" +text);
	}
}
