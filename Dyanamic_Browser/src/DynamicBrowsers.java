import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowsers {

	public static void main(String[] args) {

		String browser = "Chrome";
		
		// script
		// 2 advantages
		
		WebDriver driver = null;
		
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("Mozilla")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
		// all function names are same
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		// firstname - 
		
//		WebElement firstName = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement btn = driver.findElement(By.name("login"));
//		firstName.sendKeys("hello");
//		password.sendKeys("12345");
//		btn.click();
		
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
		// //*[@id="email"]
		///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		////*[@id="email"]
		// /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		// //*[@id="email"]
		
	}
}


