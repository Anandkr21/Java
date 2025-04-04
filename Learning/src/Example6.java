// Java constructor


public class Example6 {
	int x; // create a class attribute
	
	// create a class constructor for the Main class
	public Example6() {
		x = 5; // set the intitial value for the class attribute x
	}
	
	
	public static void main(String[] args) {
		Example6 myObj = new Example6(); // create an object of class Example6 (this will call the constructor)
		System.out.println(myObj.x); // print the value of x
	}
}
