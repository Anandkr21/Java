import java.util.HashMap;

public class Java_HashMap1 {

	public static void main(String[] args) {
		// Create a HashMap object called people
		
		HashMap<String, Integer> people = new HashMap<String,Integer>();
		
		// Add keys and values (name, age)
		people.put("John", 23);
		people.put("Steve", 20);
		people.put("Angie", 33);
		
		for(String i : people.keySet()) {
			System.out.println(i + " " + people.get(i));
		}
	}

}
