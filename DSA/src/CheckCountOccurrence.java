import java.util.HashMap;

public class CheckCountOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "selenium";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(map);

	}

}
