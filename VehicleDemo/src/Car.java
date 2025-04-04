// Car

public class Car extends Vehicle{
	private String modelName = "Mustang";   // Car attribute
	
	public static void main(String[] args) {
		
		// create a myCar object
		Car myFastCar = new Car();
		
		// call the honk() method (from the Vehicle class) on the myCar obj
		myFastCar.honk();
		
		// Display the value of the brand attribute (from the Vehicle class)  and the value of the modelName from the Car class
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
} 