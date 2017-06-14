package methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
		driver.get("https://www.google.com/");
		
		String Title = driver.getTitle();
        System.out.println("Title");
        
        String URL = driver.getCurrentUrl();
        System.out.println("URL");
				

	}

}
