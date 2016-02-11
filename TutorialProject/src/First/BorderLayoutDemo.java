package First;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame implements ActionListener{

	private JButton buttons[];
	private String names[] = { "Hide North", "Hide South", "Hide East",
			"Hide West", "Hide Center" };
	private BorderLayout layout;
	
	public BorderLayoutDemo() {
		super("BorderLayout Demo");
		
		layout = new BorderLayout(10, 10);
		buttons = new JButton[names.length];
		
		for(int i=0; i<names.length; i++){
			buttons[i] = new JButton(names[i]);
			buttons[i].addActionListener(this);
		}
		
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		BorderLayoutDemo border = new BorderLayoutDemo();
		border.setSize(300, 200);
		border.setVisible(true);
		border.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (JButton button : buttons) {
			if(e.getSource() == button)
				button.setVisible(false);
			else
				button.setVisible(true);
			
		}
		
	}
}
