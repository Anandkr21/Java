
public class Arrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = new String[5];
		
		arr[0] = "India";
		arr[1] = "USA";
		arr[2] = "Russia";
		arr[3] = "UAE";
		arr[4] = "Nepal";
		
//		System.out.println(arr[4]);
		
//		1st for loop
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

//		2nd for loop
		for(String s: arr) {
			System.out.println(s);
		}
		
		
		// In array we can store any kind of data 
		Object[] data = new Object[5];
		data[0] = "Hello";
		data[1] = 100;
		data[2] = 19.45;
		data[3] = true;
		data[4] = "there";
	}

}
