// constructor parameters

public class Example9 {
	int modelYear;
	String modelName;
	
	public Example9(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	public static void main(String[] args) {
		Example9 myObj = new Example9(1999, "Mustang");
		System.out.println(myObj.modelYear + " " + myObj.modelName);
	}
}
