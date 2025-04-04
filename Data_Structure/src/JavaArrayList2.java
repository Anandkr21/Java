import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(104);
		myNumbers.add(203);
		myNumbers.add(990);
		myNumbers.add(904);
		myNumbers.add(100);
		
		Collections.sort(myNumbers);
		System.out.println(myNumbers);
		
		
		
		// for each loop
		for(int i : myNumbers) {
			System.out.println(i);
		}
	}
}
