import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++)
		{
			sum=sum+Integer.parseInt(value.get(i).getText());
		}
		 int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
          if(total==sum)
          {
        	  System.out.println("test Passed");
          }

}
}
