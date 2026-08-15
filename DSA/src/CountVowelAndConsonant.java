
public class CountVowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "automation";
		int vowels = 0, consonants =0;
		
		for(char ch : str.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				vowels++;
			}else {
				consonants++;
			}
		}
		
		System.out.println("Vowels :-  " + vowels);
		System.out.println("Consonants :-  " + consonants);
		
		
		

	}

}
