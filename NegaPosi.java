import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NegaPosi {
	static int i;
    static String username, password, iteration;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
        for(i = 1;i <= 2; i++)
        {
        	if(i == 1){
        		username= "admin";
        		password= "admin@123";
        		iteration = "Iteration 1:";
        	}else if(i == 2)
        	{
        		username= "admi";
        		password= "admin@124";
        		iteration = "Iteration 2:";
        	}
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println(iteration + ("Input Data:") + username + "," + password + "  " + "Adminloginsuccessfull-Validinput");
			Thread.sleep(2000);

		driver.findElement(By.linkText("Logoff")).click();
		}
		
		else if(!url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			
			String ErorrMsg = driver.findElement(By.className("messageStackError")).getText();
        if(ErorrMsg.equals("Error: Invalid administrator login attempt."))
			
		{
			System.out.println(iteration + ("Input Data:") + username + "," + password + "  " + "Handling Invalidinputs---Adminlogin unsuccessfull");
		}}else
		{
			System.out.println(iteration + ":FailedS");
		}
		
		
      }//for loop clossing
driver.close();

	}

}
