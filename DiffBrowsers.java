import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
		 WebDriver firefoxdriver = new FirefoxDriver();
		 firefoxdriver.get("https://www.google.com/");
		 firefoxdriver.findElement(By.linkText("Gmail")).click();
		 Thread.sleep(2000);
		 firefoxdriver.findElement(By.linkText("Sign In")).click();
		String Text = firefoxdriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h[2]")).getText();
		
		 System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	        WebDriver chromedriver = new ChromeDriver();
	        chromedriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=7vtr4d2ln08a6gve157pt6van0");
	        firefoxdriver.findElement(By.name("firstname")).sendKeys(Text);
	        
		
		System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
        WebDriver IEdriver = new InternetExplorerDriver();
        IEdriver.get("https://login.yahoo.com/beta/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com");
        

	}

}
