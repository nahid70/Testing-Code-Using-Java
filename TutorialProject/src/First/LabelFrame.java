package First;

// Fig. 14.6: LabelFrame.java
// Demonstrating the JLabel class.
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame {
	private JLabel label1; // JLabel with just text
	private JLabel label2; // JLabel constructed with text and icon
	private JLabel label3; // JLabel with added text and icon
	// LabelFrame constructor adds JLabels to JFrame

	public LabelFrame() {
		super("Testing JLabel");
		setLayout(new FlowLayout());
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label 1");
		add(label1);

		Icon bug = new ImageIcon(getClass().getResource("th.gif"));
		label2 = new JLabel("Label with text and icon", bug,
				SwingConstants.LEFT);
		add(label2);

		label3 = new JLabel();
		label3.setText("Label with icon and text at botton");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This id label3");
		add(label3);
	}
}
