package ResetInputState;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ResetInputBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/KeyBoardActions.html");
		Actions actions = new Actions(driver);
		
		WebElement text = driver.findElement(By.id("fruit1"));
		
		actions.keyDown(text, Keys.CONTROL).perform();
		
		((RemoteWebDriver)driver).resetInputState();
		
		actions.sendKeys("A").perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
