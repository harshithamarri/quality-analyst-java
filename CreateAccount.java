import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("harshitha");
		driver.findElement(By.name("lastname")).sendKeys("marri");
		//Thread.sleep(2000);
		//driver.findElement(By.name("bod")).sendKeys("05/31/1994");
		
		
		driver.findElement(By.name("email_address")).sendKeys("marriharshitha66@gmail.com");
	
		driver.findElement(By.name("street_address")).sendKeys("blazingstar");
		driver.findElement(By.name("postcode")).sendKeys("64323");
	    
		driver.findElement(By.name("suburb")).sendKeys("nhk");
		//Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("firsco");
	    
		driver.findElement(By.name("state")).sendKeys("Tx");
		//Thread.sleep(2000);
	    
		Select dropDown = new Select(driver.findElement(By.name("country")));
	    dropDown.selectByVisibleText("United States");
	    driver.findElement(By.name("telephone")).sendKeys("5623621346");
	    driver.findElement(By.name("password")).sendKeys("mehs3129");
	    driver.findElement(By.name("confirmation")).sendKeys("mehs3129");
	    driver.findElement(By.id("tlb4")).click();
	    driver.findElement(By.xpath(".//*[@id='tdb4']")).click();
	    
	    
	    
	    String ConfirmationMsg = driver.findElement(By.xpath("/*[@id='bodyContent']/h1")).getText();
	    
	    if(ConfirmationMsg.equals("Your Account Has Been Created!"))
	    {
	    	System.out.println("Registration Successfull-Pass");
	    }
	    else
	    {
	    	System.out.println("Registration UnSuccessfull-fail");
	    }
	    
	    
	    driver.close();
	    
	
	}
	

}
