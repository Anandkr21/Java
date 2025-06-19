import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println("Please enter any number to print table: ");
		
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		System.out.println("Here is your table");
		
		for(int j = 1; j<=x; j++) {
			System.out.println("Table of " + j);
			
			for(int i = 1; i<=10; i++) {
				System.out.println(j + " * " + i +" = " + j*i);
				
			}
		}
		
	}

}
