import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Codefolyfe {
	public static void main(String[] args) {

		/*
		 * Ask the user how many hours they spent coding this week.
		 * 
		 * 1. If it's 3 or more, tell them they're a Code Ninja. fffffFfF 2. If
		 * it's less than 2, tell them to stop watching YouTube and write code
		 * instead.
		 * 
		 * 3. If it's more than 5, play the Batman theme song.
		 */
		String hours = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		int hours2 = Integer.parseInt(hours);
		if (hours2 >= 3 && hours2 <= 5) {
			JOptionPane.showMessageDialog(null, "Welcome to the Coding Ninja Club! :D");
		} else if (hours2 < 2) {
			JOptionPane.showMessageDialog(null, "Stop watching videos and do some coding! <:P");

		} else if (hours2 > 5) {
			playBatmanTheme();
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
