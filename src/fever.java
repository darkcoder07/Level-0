public class fever {
	// Bieber Fever challenge:
	// 1: Write a program that uses a for loop to print
	// baby
	// baby
	// baby
	// oh
	// Code should only contain one “baby”, and one “oh”

	// 2: Every 2nd time the “oh” should be “no”

	//
	// /3: Each chorus ends with “I thought you'd always be mine”.

	public static void main(String[] args) {

		for (int a = 0; a < 2; a++) {
			if (a % 2 == 1) {
				
				System.out.println("like");
				
			}
			for (int i = 0; i < 3; i++) {

				System.out.println("baby");
			}

			if (a % 2 == 1) {
				System.out.println("no");
			} else {

				System.out.println("oh");

			}
		}
		System.out.println("I thought you'd always be mine");
	}

}
