package DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver  = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/Desktop/MouseActions1.html");
		Actions action = new Actions(driver);
		
		// drag and drop
		WebElement source = driver.findElement(By.id("Source_Apple"));
		WebElement target = driver.findElement(By.id("Target_Apple"));
		// pause duration
		action.pause(Duration.ofSeconds(3)).dragAndDrop(source, target).perform();
		
		// click(WebElement target)
		WebElement button = driver.findElement(By.id("Question_India"));
		action.click(button).perform();
		
		// double click
		WebElement textbox = driver.findElement(By.id("textbox1"));
		action.doubleClick(textbox).perform();
		
		// contextClick()
//		action.contextClick().perform();
		
		// contextClick(WebElement target)
		action.contextClick(button).perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
