import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DynamicTestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	driver.findElement(By.id("usernameId")).sendKeys("gcderry7");
	driver.findElement(By.className("loginPassword")).sendKeys("gld938");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Captcha");
	String captcha = scan.nextLine();
	driver.findElement(By.className("loginCaptcha")).sendKeys("captcha");
	driver.findElement(By.id("loginbutton")).click();
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.irctc.co.in/eticketing/home"))
	{
		System.out.println("Loging successfull-pass");
	}else if(!url.equals("https://www.irctc.co.in/eticketing/home")) 
	{
		System.out.println("Loging unsuccessfull-failed");		
		
	Alert a = driver.switchTo().alert();
	String Error = a.getText();
	System.out.println("Invalid user");		
	a.dismiss();
	}
	/**else
	{
	
	a.accept();
	}**/
	
}
}