import java.time.Duration;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String text=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 System.out.println(text);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("inputUsername")).sendKeys(new String[] {"rahul"});
	    driver.findElement(By.name("inputPassword")).sendKeys(new String[] {text});
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		
	

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String password=driver.findElement(By.className("infoMsg")).getText();
		 String[] passarray=password.split("'");
         String finalpass=passarray[1].split("'")[0];
         return finalpass;
		
	}

}
