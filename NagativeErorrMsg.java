import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NagativeErorrMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		
/**invalid inputs and/or Valid Inputs   Invalid-Adminlogin unsuccessfull, capture Error Msg   Valid-Adminlogin Successfull-Got to nxt page*/
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/login.php?action=process"))
		{
		String ErorrMsg = driver.findElement(By.className("messageStackError")).getText();
        if(ErorrMsg.equals("Error: Invalid administrator login attempt."))
			
		{
			System.out.println("Handling Invalidinputs---Adminlogin unsuccessfull");
		}}else
		{
			System.out.println("Not Handling Invalidinput---Adminlogin Successfull");
		}
		driver.close();
		
	}

}
