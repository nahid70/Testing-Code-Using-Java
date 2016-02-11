package First;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex extends JFrame implements ActionListener{

	JButton buttons[] ;
	String names[] = {"n", "s", "e", "w", "c"};
	
	public ex() {
		buttons = new JButton[names.length];
		
		setLayout(new GridLayout(3, 2));
		
		
		for(int i =0; i<names.length; i++)
		{
			buttons[i] = new JButton(names[i]);
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
		
//		add(buttons[0], BorderLayout.NORTH);
//		add(buttons[1], BorderLayout.SOUTH);
//		add(buttons[2], BorderLayout.EAST);
//		add(buttons[3], BorderLayout.WEST);
//		add(buttons[4], BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		ex e = new ex();
		e.setSize(400,400);
		e.setVisible(true);
		e.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(JButton button : buttons){
			if(e.getSource() == button)
				button.setVisible(false);
			else
				button.setVisible(true);
		}
		
	}
}
