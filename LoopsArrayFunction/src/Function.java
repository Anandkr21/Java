
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		int r = add(10,20);
		System.out.println(r);
		
		//
		boolean result = isWordPresent("This is not a very good idea" , "not");
		System.out.println(result);
	}
	
	public static int add(int a, int b) {
		System.out.println(a+" "+b);
		
		int res = a+b;
		
		return res;
	}
	
	//word present - true;
	// word not present - false
	
	public static boolean isWordPresent(String str, String word) {
		if(str.indexOf(word) == -1)
			return false;
		else
			return true;
	}
	
	
	public static void xyz(String x, int y, boolean z) {
		
	}

	
	public boolean login(String username, String password, String expectedResult) {
		return true;
	}
}
