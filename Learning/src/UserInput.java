import java.util.Scanner;  // Import the scanner class

class UserInput{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter username: ");
		userName = myObj.nextLine();
		
		System.out.println("UserName is: " + userName);
		
		// close the scanner
		myObj.close();
	}
}