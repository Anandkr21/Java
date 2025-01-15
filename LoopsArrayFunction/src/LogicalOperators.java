
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b=200;
		int c=300;
		int d=400;
		
		// Diff b/w  &  &&
		
		if(isLoggedIn() & isInboxLinkPresent()) {
			System.out.println("Coompose mail");
		}
		// a<b and c<d
		if(a<b & a<c) {
			System.out.println("hello");
		}

	}
	
	public static boolean isLoggedIn() {
		System.out.println("isLoggedIn");
		return true;
	}
	
	public static boolean isInboxLinkPresent() {
		System.out.println("isInboxLinkPresent");
		return false;
	}
}
