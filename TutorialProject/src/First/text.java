package First;



import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.EventHandler;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class text extends JFrame {

	TextArea area;

	public text() {
		area = new TextArea();
		
		
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == e.VK_ENTER)  {
			            String text = area.getText();
			            area.setText("");
			        }
				
			}
		});
		
		
		
		add(area);
	}
	
	
	public static void main(String[] args) {
		text t = new text();
		t.setSize(400,400);
		t.setVisible(true);
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
