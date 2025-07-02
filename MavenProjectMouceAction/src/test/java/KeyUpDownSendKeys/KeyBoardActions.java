package KeyUpDownSendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/KeyBoardActions.html");
		Actions actions = new Actions(driver);
		
		WebElement text = driver.findElement(By.id("fruit1"));
		
		// ctrl A+C
		actions.keyDown(text, Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		// click TAB btn
		actions.keyDown(Keys.TAB);
		
		// ctrl + V
		actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
