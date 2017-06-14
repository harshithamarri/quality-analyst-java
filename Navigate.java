package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium");
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();

	}

}
