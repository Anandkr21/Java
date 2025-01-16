
public class FacebookPage {
	
	String name; // non static global variable - object name
	int pageviews; // non static global variable - object name 
	static String owner; // static global variable - class name
	
	public void printPageDetails() {   // non-static function
		System.out.println(name+"-----"+pageviews+"------"+owner);
	}
	
	public void increasePageViews(int views) { //non static function
		pageviews = pageviews+views;
		int i = 100;
		System.out.println(i);
	}
	
	public static void printCompanyDetails() {
		System.out.println(owner + ". Founded in 2005");
		
		int i=100; // local variable
		System.out.println(i);
	}
	
	
	
}
