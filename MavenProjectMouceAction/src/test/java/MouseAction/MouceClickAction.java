package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceClickAction {

	public static void main(String[] args) throws InterruptedException {
		
//		Scroll to an Element , Move to an Element
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/MouseActions2.html");
		Actions actions = new Actions(driver);
		
		WebElement btn_thirty = driver.findElement(By.xpath("//button[text()='Thirty']"));
		// it will only scroll to left
//		actions.pause(Duration.ofSeconds(3)).scrollToElement(btn_thirty).perform();
		
		// it will scroll and click on button
		actions.pause(Duration.ofSeconds(3)).moveToElement(btn_thirty).perform();
		
		
		WebElement btn_J = driver.findElement(By.xpath("//button[text()='J']"));
//		actions.pause(Duration.ofSeconds(2)).scrollToElement(btn_J).perform();
		
		actions.pause(Duration.ofSeconds(2)).moveToElement(btn_J).perform();
		
		
		
		
	}

}
