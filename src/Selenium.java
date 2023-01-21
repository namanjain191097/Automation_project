import java.time.Duration;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("inputUsername")).sendKeys(new String[] {"rahul"});
	    driver.findElement(By.name("inputPassword")).sendKeys(new String[] {"1234"});
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(new String[] {"john"});
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(new String[] {"naman@123"});
		driver.findElements(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='Text']:nth-child(3)")).sendKeys(new String[] {"naman@gmail.com"});
		driver.findElement(By.xpath("//form/input[3]")).sendKeys(new String[] {"9897564433"});
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(new String[] {"rahul"});
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(new String[] {"rahulshettyacademy"});
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
			
	}

}
 