
public class StringSwap {
	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = "hello";
		
		swap(str1,str2);
		
		
		
	}

	private static void swap(String str1, String str2) {
		// TODO Auto-generated method stub
		String temp = new String("");
		temp = str1;
		str1 = str2;
		str2 = temp;
		

		System.out.println("Hi " + str1);
		System.out.println("hello " +str2);
	}
}
