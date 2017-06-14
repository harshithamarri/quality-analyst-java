import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("marriharshitha99@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("mehs3129");
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mehs3129");
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath(".//div[contains(text(),'COMPOSE')]")).click();
		
		
		Thread.sleep(7000);
		//driver.findElement(By.id(":dy")).sendKeys("marriharshitha99@gmail.com");
		driver.findElement(By.name("to")).sendKeys("marriharshitha99@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("subjectbox")).sendKeys("File Upload");
		
		
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		
		
		
		Thread.sleep(8000);  
		
		StringSelection ss = new StringSelection("C:\\Users\\harshitha\\Desktop\\QA Resumes\\Resume\\QA harshitha3.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);  
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		//driver.findElement(By.id(":d2")).click();
		driver.findElement(By.xpath(".//div[contains(text(),'Send')]")).click();
		
		
		
	    
		}

}
