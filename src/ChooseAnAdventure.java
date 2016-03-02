import javax.swing.JOptionPane;

public class ChooseAnAdventure {
public static void main(String[] args) {
	
int badrandom = 0;
int goodrandom=0;
int okayrandom=0;
	
JOptionPane.showMessageDialog(null, "You wake up in a strange world. You're pretty sure that this isn't your workplace."
		+ " It looks just like it, but a cold and dark feeling emanates from all around you. Oh. A warning. this might be Horror. :D");

String nchoice1 = JOptionPane.showInputDialog("Choose a number from 1 to 10");
	
int inchoice1 = Integer.parseInt(nchoice1);	
	
	
if (inchoice1>=7&&inchoice1<=10) {	
 JOptionPane.showMessageDialog(null, "Good number! You see a closet at the other side of the room. Inside it, you see a flashlight, a.....mask? It looks like a bunny."
			+ "-And a plushy of a strange creature that looks like a toy fox.");
 String choice1 = JOptionPane.showInputDialog("Do you go into the East Hallway, the South hallway, the bathroom, or a sign that says: Escape here! :)");


if (choice1.equalsIgnoreCase("the bathroom")) {
JOptionPane.showMessageDialog(null, "When you come in, you feel weird. Can this really be true? Why am I stuck here? After a few minutes of pondering, you come out...and wake up. Congrats! You took the easy way out and escaped the nightmare! :D");	
}

if (choice1.equalsIgnoreCase("the east hallway")) {
	JOptionPane.showMessageDialog(null, "Okay. At the start, you took the good path. So choose a number from 1 to 10.");
}
if (choice1.equals("3")||choice1.equals("9")||choice1.equals("5")||choice1.equals("7")||choice1.equals("10")) {
JOptionPane.showMessageDialog(null, "You chose the correct number! You find a tunnel, and as you walk out you wake up. In the real world. Or is it? :O. The end.");	
}
 if (choice1.equalsIgnoreCase("the south hallway"))	 {
	 JOptionPane.showMessageDialog(null, "A monster eats you. South is baaad :P");
 }
}


if (inchoice1<7) {
	JOptionPane.showMessageDialog(null, "Not good. Looking around, you see some traces of blood, a batte"
			+ "red flashlight on a table, and distant laughter from below.");
	badrandom++;
	String choice1 = JOptionPane.showInputDialog("Do you go into the East Hallway, the South hallway, the bathroom, or a sign that says: Escape here! :)i.e: the south hallway i.e: sign that says....etc.");

if (choice1.equalsIgnoreCase("the bathroom")) {
JOptionPane.showMessageDialog(null, "When you come in, you feel weird. Can this really be true? Why am I stuck here? After a few minutes of pondering, you come out...and wake up. Congrats! You took the easy way out and escaped the nightmare! :D");	
}
if (choice1.equalsIgnoreCase("the east hallway")) {
	JOptionPane.showMessageDialog(null, "Okay. At the start, you took the bad path. So choose a number from 1 to 20.");
}
if (choice1.equals("3")||choice1.equals("9")||choice1.equals("11")||choice1.equals("17")||choice1.equals("20")||choice1.equals("9")||choice1.equals("1")) {
JOptionPane.showMessageDialog(null, "You chose the correct number! You find a tunnel, and as you walk out you wake up. In the real world. Or is it? :O. The end.");	
}
if (choice1.equalsIgnoreCase("the south hallway"))	 {
	 JOptionPane.showMessageDialog(null, "A monster eats you. South is baaad :P");
}
}


	
	
	
	
	
	
	
	
	
	
}

}