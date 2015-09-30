import javax.swing.JOptionPane;

public class riddleme {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String riddle1 = JOptionPane
				.showInputDialog("What gets wetter as it dries?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (riddle1.equals("a towel")) {
			JOptionPane.showMessageDialog(null, "Correcto!");
			score += 1;}
		else { JOptionPane.showMessageDialog(null, "Wrong!"); score -= 1; 
		JOptionPane.showMessageDialog(null, "Answer: a towel");}
		
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
		String riddle2 = JOptionPane.showInputDialog("Why did chica cross the road?");
				if (riddle2.equals("To get to the other pizza.")) {
					JOptionPane.showMessageDialog(null, "Correcto!"); score += 1;
				}
				else { JOptionPane.showMessageDialog(null, "Wrong!"); score -= 1;
				JOptionPane.showMessageDialog(null, "Answer: To get to the other pizza.");}
				JOptionPane.showMessageDialog(null, "Score: " + score) ;
				JOptionPane.showMessageDialog(null, "I hope you liked meh jokes :D");
	}
}
