
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
