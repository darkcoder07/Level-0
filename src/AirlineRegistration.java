
	// Redstone Incorporation Copyright
	import javax.swing.JOptionPane;

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public class AirlineRegistration {
		public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Redstone Inc. needs your first name. Please enter below");	
String lastname = JOptionPane.showInputDialog("Your surname?");
String destination = JOptionPane.showInputDialog("Your destination?");
String birthday = JOptionPane.showInputDialog("Your birthday? - For security reasons");
String gender = JOptionPane.showInputDialog("Finally, your gender? - Again, security only");
JOptionPane.showMessageDialog(null, "Done! Your airline ticket is: Name: " + name + " Surname: " + lastname + " Flying to: " + destination +  " Security data - Your birthday: " + birthday + " Gender: " + gender + " You are ready to fly!" );
	}}



