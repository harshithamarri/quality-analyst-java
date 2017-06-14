import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
		if(existence == true)
		{
			System.out.println("Gmail link exist-passed");
		}else
		{
		System.out.println("Gmail link notexist-failed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}

/**if(driver.findElement(By.linkText("Gmail")).isDisplayed();)
{
	System.out.println("Gmail link exist-passed");
}else
{
System.out.println("Gmail link notexist-failed");
}
String url = driver.getCurrentUrl();
		System.out.println(url);


**/