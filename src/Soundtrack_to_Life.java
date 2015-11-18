
import java.net.URI;

import javax.swing.JOptionPane;

public class Soundtrack_to_Life {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "Yo, how are you feeling today?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "MUCHSTRESS", "Feeling sad cause you couldn't do something"}, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood);

		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 1) {
			playVideo("http://www.youtube.com/watch?v=yO7MWuJ7zLA");
		}

		// 4. Play different songs for other moods.
		else if (userMood == 2) {
			playVideo("https://www.youtube.com/watch?v=idCyhiFxxrQ");
		}

		// If you are seeing ads at the beginning of your videos, install
		// Adblock.
		else if (userMood == 0) {
			playVideo("https://www.youtube.com/watch?v=ZXsQAXx_ao0");
		}
	}

	static void playVideo(String youtubelink) {
		try {
			URI uri = new URI(youtubelink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
