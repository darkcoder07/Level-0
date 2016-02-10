import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	
String userheight = JOptionPane.showInputDialog("How tall are you? (In inches)");
long userheight2 = Integer.parseInt(userheight);
if (userheight2<48) {
	JOptionPane.showMessageDialog(null, "Sorry. You have to keep growing D:");
	
}
else {
	JOptionPane.showMessageDialog(null, "Enjoy your ride on the coaster! :)");
}
}















}

