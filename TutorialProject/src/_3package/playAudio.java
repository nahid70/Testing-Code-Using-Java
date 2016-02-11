package _3package;
import java.awt.Component;
import java.io.*;

import javax.sound.sampled.AudioSystem;
import javax.swing.JFileChooser;

import sun.audio.*;

public class playAudio {
	public playAudio() {
		try {
			JFileChooser openf = new JFileChooser();
			Component j = null;
			openf.showOpenDialog(j);
			File fl = openf.getSelectedFile();
			String st = fl.getAbsolutePath();
			InputStream in = new FileInputStream(st);
			AudioSystem au = new AudioStream(in);
			Audiop
		} catch (Exception e) {

		}
	}
	
	private void mian() {
		
	}
}
