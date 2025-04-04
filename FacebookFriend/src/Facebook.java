// automating facebook

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {

String browser = "Chrome";
		
		// script
		// 2 advantages
		
		WebDriver driver = null;
		
		
		if(browser.equals("Chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--start-maximized"); // max screen
			ops.addArguments("--disable-notifications");
			
			
			driver = new ChromeDriver(ops);
			
		}else if(browser.equals("Mozilla")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
		//all function names are same
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Use this for Selenium 4+
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("anandkumargupta.akg15@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//span[text()='Anand Kumar']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Anand Kumar']")));
		driver.findElement(By.xpath("//div[text()='Anand Kumar']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Friends']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Friends']")));
		driver.findElement(By.xpath("//span[text()='Friends']")).click();
		
		
		List<WebElement> friendsBeforeScrolling = null;// driver.findElement(By.xpath("div[@class='buofh1pr hv4rvrfc']/div[1]/a/span"));
		List<WebElement> friendsAfterScrolling = null;
		System.out.println("Total "+ friends.size());
		
		
		while(true) {
			friendsBeforeScrolling = driver.findElement(By.xpath("div[@class='buofh1pr hv4rvrfc']/div[1]/a/span"));
			int y = friends.get(friends.size()-1).getLocation().y;
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+y+");");
			Thread.sleep(3000);
			// scrolled 
			friendsAfterScrolling = driver.findElement(By.xpath("div[@class='buofh1pr hv4rvrfc']/div[1]/a/span"));
			System.out.println("Total "+ friendsAfterScrolling.size());
			
			if(friendsBeforeScrolling.size() == friendsAfterScrolling.size()) 
				break;
			
		}
		
		for(WebElement e : friendsAfterScrolling) {
			System.out.println(e.getText());
		}

//		driver.findElement(By.xpath("//span[text()='Friends']")).click();
		
	
	}

}
