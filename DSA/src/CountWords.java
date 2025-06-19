
public class CountWords {

	public static void main(String[] args) {

		String word = "One Two Three";
		
		int countWords = word.split("\\s").length;
		System.out.println(countWords);
		
		
		String txt = "ABCDE";
		System.out.println("total length: " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
		
		// finding a character in a string
		
		System.out.println(txt1.indexOf("world"));
	}

}
