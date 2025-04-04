import java.util.HashMap;

public class Java_Hashmap {

	public static void main(String[] args) {
		
		// create a Hashmap object called capitalCities
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		
		// add keys and values (Country, CIty)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		
		// access
		System.out.println(capitalCities.get("England"));
		
		// Remove
		System.out.println(capitalCities.remove("England"));
		
		// size()
		System.out.println(capitalCities.size());
				
		// for each loop using HashMap 
		// print keys
		for(String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		
		// print values
		for(String i: capitalCities.keySet()) {
			System.out.println(i);
		}
		
		
		// print keys and values
		for(String i : capitalCities.keySet()) {
			System.out.println(i + " : " + capitalCities.get(i));
		}
		
		// clear() to remove all
		capitalCities.clear();
		System.out.println(capitalCities);
		
		
		
	}

}
