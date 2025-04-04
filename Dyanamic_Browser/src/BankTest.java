import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankTest {

	public static void main(String[] args) {

		HSBCBank h = new HSBCBank();
		h.transfer();
		h.deposit();
		h.clearCheque();
		h.onCallTransfer();
		
		CitiBank c = new CitiBank();
		c.transfer();
		c.deposit();
		c.clearCheque();
		
		Bank b = new HSBCBank();
		b.transfer();
		b.deposit();
		b.clearCheque();
//		b.onCallTransfer();
		
		Bank b1 = new CitiBank();
		b1.transfer();  // citi
		b1 = new HSBCBank();
		b1.transfer();  // hsbc
		
		
		Bank b2 = null;
		b2 = new CitiBank();
		b2.transfer();  // citi
		b2 = new HSBCBank();
		b2.transfer();  // hsbc
		
		ChromeDriver cd = new ChromeDriver();
		FirefoxDriver fd = new FirefoxDriver();
		
		WebDriver d1 = new FirefoxDriver();
		d1.get("http://yahoo.com");
		
		d1 = new ChromeDriver();
		d1.get("http://google.com");
		
		
		WebDriver driver = new ChromeDriver();
		
	}

}
