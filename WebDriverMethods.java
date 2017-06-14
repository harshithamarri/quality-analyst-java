package methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");

		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
		 
		//FirefoxDriver driver = new FirefoxDriver(options);
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		String Title = driver.getTitle();
        System.out.println(Title);
        
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        
        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox/15c7b17f680faba4");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        

        driver.navigate().back(); 
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        
        driver.navigate().forward(); 
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        
        System.out.println(driver.findElement(By.name("btnK")).getAttribute("value"));
        driver.findElement(By.id("sb_ifc0")).sendKeys("selenium classes");
        System.out.println(driver.findElement(By.id("gs_htif0")).getAttribute("text-align"));
        System.out.println(driver.findElement(By.id("gs_htif0")).getText());
        
        driver.navigate().to("http://qtpselenium.com/home/plan/Selenium?p=19&b=59");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        
        System.out.println(driver.findElement(By.xpath(".//*[@id='plan_id']")).isEnabled());
        
        
        
	}
	

}






