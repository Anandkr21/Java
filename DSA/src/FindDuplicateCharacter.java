import java.util.HashMap;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "testautomation";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch: map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println(ch + " -> " + map.get(ch));
			}
		}

	}

}
