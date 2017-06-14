import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TcLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium");
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.navigate().back();
		//now verify dis current url is internal/external link-redirecting to another page in same application or not
		if(url.contains("wikipedia.org"))
		{
			System.out.println("current url is internal link-redirecting to another page in same application");
		}
		else{
			System.out.println("current url is internal link-redirecting to another page in other application");
		}
driver.navigate().back();

url = driver.getCurrentUrl();
System.out.println(url);

driver.findElement(By.partialLinkText("Disc")).click();
Thread.sleep(5000);
url = driver.getCurrentUrl();
Thread.sleep(5000);
System.out.println(url);
if(!url.contains("wikipedia.org"))
{
	System.out.println("current url is External link-redirecting to another page in other application");
}
else{
	System.out.println("current url is internal link-redirecting to another page in other application");
}
//else ladder{
	//System.out.println("current url is internal link-redirecting to another page in same application");
//}
	

driver.close();
	}

}
