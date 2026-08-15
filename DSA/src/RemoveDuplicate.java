
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		HashSet<Character>  set = new HashSet<>();
		String result = "";
		
		for(char ch: str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				result +=ch;
			}
		}
		
		System.out.println(result);
		

	}

}
