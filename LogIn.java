import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("rahman1237@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.id("tdb5")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("http://www.gcrit.com/build3/index.php"))
			//if(url.contains("http://www.gcrit.com/build3/index.php"))
				
		{
			System.out.println("login successfull");
		}else
		{
			System.out.println("login unsuccessfull");
		}
		
		driver.close();
	}

}
