
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
		}else{
			System.out.println("Both are not equals");
		}
		
		str1 = str1.substring(1,15); // using substring to print specific character
		System.out.println(str1);
		
		
		int str3 = str1.indexOf("fine"); // indexOf to print index of any word
		System.out.println(str3);
		
		System.out.println(str1.substring(str3));
		
		String s = str1.replace("fine", "good");
		System.out.println(str1);
		
		s = str1.replaceAll(" ", "_");
		System.out.println(s);


		int age = 45;
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote.");
		}



		
		// string concatenation
		String newStr = "            Hello all of you, how are you all           .";
		// trim function will trim only leading and trailing spaces
		String trimStr = newStr.trim();
		
		// replaceAll function used to remove space from middle
		System.out.println(trimStr.replaceAll("\\s+", " "));
		
		
		
		
		// compare two string
		String x = "userName";
		String y = "UserName";
		
		// checking strictly
		System.out.println(x.equals(y));
		// ignoring case upper lower
		System.out.println(x.equalsIgnoreCase(y));
		
	}
	

}
