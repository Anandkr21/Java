
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Today is a fine day. I am learning.";
		String str2 = "Today is a fine day. I am learning.";
		
		int char1 = str1.length(); // count the length of string
		
		System.out.println(char1);
		
		
		boolean b = str1.equals(str2); // comparing both string equals or not
		System.out.println(b);
		
		if(str1.equals(str2)) {
			System.out.println("Both are equals");
		}
	}
	

}
