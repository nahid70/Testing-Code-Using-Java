package _3package;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

public class main {
	 AePlayWave aw = new AePlayWave( "C:\\WINDOWS\\Media\\tada.wav" );
     aw.start();
}
