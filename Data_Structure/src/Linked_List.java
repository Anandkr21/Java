import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
 
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mustang");
		
		// use addFirst() to add the item to the beginning
		cars.addFirst("Mazda"); 
		System.out.println(cars);
		
		// use addLast() to add in the last
		cars.addLast("Jaguar");
		System.out.println(cars);
		
		// removeFirst() to remove item from beginning
		cars.removeFirst();
		System.out.println(cars);
		
		//removeLast() to remove last item
		cars.removeLast();
		System.out.println(cars);
		
		// get the item from beginning
		System.out.println(cars.getFirst());  
		
		// get the item from last
		System.out.println(cars.getLast());
	}

}
