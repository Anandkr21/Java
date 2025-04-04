import java.util.ArrayList;
import java.util.Collections;

public class JavaList1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		cars.add(3, "Mazda");  // insert element at the beginning of the list
		
		System.out.println(cars);
		System.out.println(cars.get(2));  //get
		System.out.println(cars.set(0, "Opel"));  // set
		System.out.println(cars.remove(0)); // remove
		System.out.println(cars.size());  // List size
//		cars.clear();
		System.out.println(cars); // remove all element
		Collections.sort(cars);  // Sort cars
		
		// printing using for loop
		for(int i =0; i< cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		
		System.out.println("------------------------------");
		
		
		
		// printing using for each loop
		for(String i : cars) {
			System.out.println(i);
			}
		}

}

