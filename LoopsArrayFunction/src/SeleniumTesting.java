package training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SeleniumTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://techyvicky.com");
		driver.findElement(By.xpath("//a[contains(text(), 'My Youtube Video Blog)]")).click();
		
		Thread.sleep(15000);
		driver.quit();
	}

}
