
public class Example12 {
	// static method

	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects.");
	}
	
	// public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects.");
	}
	public static void main(String[] args) {
		myStaticMethod();    // call the static method
		
		Example12 myObj = new Example12();  // create an object of MyClass
		myObj.myPublicMethod();   // Call the public method
	}

}
