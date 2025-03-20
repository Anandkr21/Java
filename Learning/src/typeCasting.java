
public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Type casting is when you assign a value of one primitive data type to another type.
		 * 
		 * In java there are two types of casting
		 * 
		 * Widening Casting (automatically) - converting a smaller type to a larger size
		 * 
		 * byte -> short-> char -> int -> long -> float -> double
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size type.
		 * 
		 * double -> float -> long -> int -> char -> short -> byte
		 * 
		 * 
		 */
		
		// widening casting
		
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);   // 9
		System.out.println(myDouble); // 9.0
		
		// Narrowing casting
		
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1; // Manual casting: double int
		
		System.out.println(myDouble1);
		System.out.println(myInt1);
		
		
		
		
		
		
		// 2 ways of concat
		// using +
		// using concat keyword
		
		String myFirstName = "Anand";
		String myLastName = "Gupta";
		System.out.println(myFirstName + " " + myLastName);
		
		System.out.println(myFirstName.concat(" ").concat(myLastName));

	}

}
