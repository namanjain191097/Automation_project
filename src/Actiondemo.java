import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[1]/div[1]"))).build().perform();

	}

}
