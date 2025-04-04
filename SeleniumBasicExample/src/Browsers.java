import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SoftData\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		ChromeDriver cd = new ChromeDriver();
	}

}
