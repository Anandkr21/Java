// Access methods with an object

/*
 * Example
Create a Car object named myCar. Call the fullThrottle() and 
speed() methods on the myCar object,and run the program:
 */
public class Example5 {

	// create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	// Create a speed() method and add a parameter
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: "+maxSpeed);
	}
	
	// Inside main, call the methods on the myCar object
	
	public static void main(String[] args) {
		Example5 myCar = new Example5(); // create a myCar Object
		
		myCar.fullThrottle();
		myCar.speed(200);
		
	}

}
