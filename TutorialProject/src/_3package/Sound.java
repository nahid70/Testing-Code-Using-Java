package _3package;

import java.awt.*;

import javax.sound.sampled.AudioSystem;
import javax.swing.*;

import sun.audio.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sound extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new Sound();
	}
	
	JButton btn;
	
	public Sound() {
		setSize(200, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn = new JButton("play me");
		btn.addActionListener(this);
		add(btn);
//		show(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		music();
	}
	
	public static void music(){
		AudioPlay MGP;
		AudioSystem BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		
		try {
			BGM = new AudioStream(new FileInputStream("myMusic.wav"));
			MD = BGM.getData();
			loop = new ContinousAudioDataStream(MD);
			
		} catch (IOException error) {
			MGP.start(loop);
		}
	}

}
