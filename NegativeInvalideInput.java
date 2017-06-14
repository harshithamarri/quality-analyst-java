import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeInvalideInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		boolean existence = driver.findElement(By.linkText("Yahoo")).isDisplayed();
		
		//Nagative Testing
		try
		{
		if(existence == true)
		{
			System.out.println("Gmail link exist-passed");
		}}
		
		catch(NoSuchElementException e)
		{
		System.out.println("Gmail link notexist-failed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
