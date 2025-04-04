
public class Through_Keyword {

	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied - you must be at least 18");
		}else {
			System.out.println("Access granted - you are old enough");
		}
	}

	
	public static void main(String[] args) {
		checkAge(15); //set age to 15
	}
}
