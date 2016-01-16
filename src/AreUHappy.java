import javax.swing.JOptionPane;

public class AreUHappy {
public static void main(String[] args) {
	

	
String areyouhappy = JOptionPane.showInputDialog("Are you happy? (yes or no)");
	
	
if (areyouhappy.equalsIgnoreCase("yes")) {	
	
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");	
	
}
else if (areyouhappy.equalsIgnoreCase("no")) {


String wanttobehappy = JOptionPane.showInputDialog("Do you want to be happy?");

if (wanttobehappy.equalsIgnoreCase("no")) {
	
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");	
	
}
else if (wanttobehappy.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "Change something.");	
	
	
}
}



























}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
