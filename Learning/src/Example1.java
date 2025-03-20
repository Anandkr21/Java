
public class Example1 {
	int x = 5;
	public static void main(String[] args) {
		Example1 myObj1 = new Example1();
		Example1 myObj2 = new Example1();
		
		myObj2.x = 25;
		
		System.out.println(myObj1.x); // 5
		System.out.println(myObj2.x); // 25

	}

}
