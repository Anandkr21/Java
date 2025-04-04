// LocalDate -- year, month, day(yyyy - MM - dd))
// LocalTime -- hour,minute,second and nanoseconds (HH-mm-ss-ns)
// LocalDateTime -- yyyy-MM-dd-HH-mm-ss-ns
// DateTimeFormatter -- formatter for displaying aand parsing date - time objects

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 

public class DateTime {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now(); // create date obj
		System.out.println(myObj);  // display the current date
		
		
		LocalTime myObj1 = LocalTime.now();  // create local time obj
		System.out.println(myObj1);  // display the current date
		
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println(myObj2);
		
		
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		
	}

}


//  Value			Example
//yyyy-MM-dd	"1988-09-29"	
//dd/MM/yyyy	"29/09/1988"	
//dd-MMM-yyyy	"29-Sep-1988"	
//E, MMM dd yyyy	"Thu, Sep 29 1988"