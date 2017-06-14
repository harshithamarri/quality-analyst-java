import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleGmailLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		WebElement existence = driver.findElement(By.linkText("Gmail"));
		
		System.out.println(existence.isDisplayed());
		System.out.println(existence.isEnabled());
		existence.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		
		driver.close();
	}
		

}
