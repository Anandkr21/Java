package FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMaven {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		String exp_url = "https://www.facebook.com/";
		String act_url = driver.getCurrentUrl();
		
		if(exp_url.equals(act_url)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		Thread.sleep(2000);
		driver.quit()	;
		
		// normal locator ==> id, name, tagname, classname, linktext, partiallink
		// customize locator ==> css seletor, xpath
	}

}
