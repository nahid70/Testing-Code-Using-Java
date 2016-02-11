package _3package;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Aodio extends JFrame implements ActionListener {

	JButton btn ;
	public Aodio() {
		setSize(200, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		btn = new JButton("play");
		btn.addActionListener(this);
		add(btn);
		
	}
	
	public static void main(String[] args) {
		new Aodio();
	}

	private void playSound() 
	{
	  try
	  {
	    // get the sound file as a resource out of my jar file;
	    // the sound file must be in the same directory as this class file.
	    // the input stream portion of this recipe comes from a javaworld.com article.
	    InputStream inputStream = getClass().getResourceAsStream(SOUND_FILENAME);
	    AudioStream audioStream = new AudioStream(inputStream);
	    AudioPlayer.player.start(audioStream);
	  }
	  catch (Exception e)
	  {
	    // a special way i'm handling logging in this application
	    if (debugFileWriter!=null) e.printStackTrace(debugFileWriter);
	  }
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
//		URL url = this.getClass().getClassLoader().getResource("myMusic.wav");
//        AudioInputStream audioIn;
//		try {
//			audioIn = AudioSystem.getAudioInputStream(url);
//			Clip clip = AudioSystem.getClip();
//	        clip.open(audioIn);
//	        clip.start();
//		} catch (UnsupportedAudioFileException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (LineUnavailableException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//        //clip.stop();
		System.out.println("ok");
	}
}
