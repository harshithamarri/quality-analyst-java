import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NagativeTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		//invalid inputs-Adminlogin unsuccessfull, V Dont Capture That ERROR MSG
		driver.findElement(By.name("username")).sendKeys("admi");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//invalid expected value at comparing for virification
		//if(url.equals("http://www.gcrit.com/build3/admin/index7.php"))
		if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
			
		{
			System.out.println("Adminlogin successfull-Validinput");
		}else
		{
			System.out.println("Adminlogin unsuccessfull-Invalidinput");
		}
		
		//driver.close();

	}

}
