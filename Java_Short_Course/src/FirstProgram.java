
public class FirstProgram {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		System.out.println("Hello");
		System.out.println(a==b?"equal":"false");
		
		switch(a) {
		case 4:
			System.out.println("It is four");
			break;
		case 5: 
			System.out.println("It is five");
			break;
		default:
			System.out.println("case default");
		}
			
	}

}
