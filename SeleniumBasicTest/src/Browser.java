import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static void main(String[] args) {
        // Set ChromeDriver path properly
        //System.setProperty("webdriver.chrome.driver", "E:\\Auto\\Important Soft_Data\\chromedriver-win32\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.facebook.com");
        
        // Print the title
        System.out.println("Page Title: " + driver.getTitle());
        
        // Close the browser
        driver.quit();
    }
}
