import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			int i=1;
			while(i<5)
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
