import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {	
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.

if (randomNumber == 0) {
	
	
JOptionPane.showMessageDialog(null, "You know, you are an amazing person!");
	
}

	// 3. Use the randomNumber to give the user a random compliment.
if (randomNumber == 1) {


JOptionPane.showMessageDialog(null, "Your eyes have that shining luster!");

}

// 3. Use the randomNumber to give the user a random compliment.
if (randomNumber == 2) {


JOptionPane.showMessageDialog(null, "Everyone doesn't know your true potential, once they see you they'll be shocked.");

}
if (randomNumber == 3) {


JOptionPane.showMessageDialog(null, "You are so lucky not to be attacked by Monty Python bunnies! (Esoteric reference)");

}
if (randomNumber == 4) {


JOptionPane.showMessageDialog(null, "Your future will be very bright!");

}     
	}
	
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}


