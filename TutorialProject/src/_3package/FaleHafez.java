package _3package;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FaleHafez {

	private JFrame frame;
	private JLabel lblCloseImage, lblCloseHover, lblChooser, lblInterface,
			lblImage;

	private String filenames[] = { "1", "2", "3", "4" };

	public FaleHafez() {

		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setLayout(null);

		frame.setSize(480, 605);
		frame.setLocationRelativeTo(null);

		lblCloseImage = new JLabel(new ImageIcon(getClass().getResource(
				"btnClose.PNG")));
		lblCloseHover = new JLabel(new ImageIcon(getClass().getResource(
				"btncloseHover.PNG")));

		frame.add(lblCloseHover).setBounds(455, 0, 20, 20);
		frame.add(lblCloseImage).setBounds(455, 0, 20, 20);

		lblCloseHover.setVisible(false);
		lblCloseHover.setToolTipText("Close");

		lblChooser = new JLabel(new ImageIcon(getClass().getResource(
				"lblchooser.PNG")));
		frame.add(lblChooser).setBounds(170, 525, 200, 100);

		lblInterface = new JLabel(new ImageIcon(getClass().getResource(
				"interface.PNG")));
		frame.add(lblInterface).setBounds(10, 30, 460, 550);

		MouseListener l = new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == lblCloseImage) {
					lblCloseHover.setVisible(true);
				}
			}

			public void mousePressed(MouseEvent e) {

				if (e.getSource() == lblCloseHover) {
					System.exit(0);
				} else if (e.getSource() == lblChooser) {
					Random random = new Random();
					int t = random.nextInt(filenames.length);
					String file = t + ".PNG";
					lblInterface.setVisible(false);
					lblImage = new JLabel(new ImageIcon(getClass().getResource(
							file)));
					frame.add(lblImage).setBounds(10, 30, 460, 500);
					lblChooser.setVisible(false);

					javax.swing.SwingUtilities.invokeLater(new Runnable() {
						public void run() {
						}
					});

				}
			}

			public void mouseExited(MouseEvent e) {

			}
		};

		lblCloseImage.addMouseListener(l);
		lblCloseImage.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblCloseHover.addMouseListener(l);
		lblCloseHover.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblChooser.addMouseListener(l);
		lblChooser.setCursor(new Cursor(Cursor.HAND_CURSOR));

		frame.getContentPane().setBackground(Color.BLACK);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new FaleHafez();
	}

}