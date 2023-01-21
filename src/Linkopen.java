import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkopen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver=Footer.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));

		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(new String[] {clickon});
			Thread.sleep(5000);
		}
			Set <String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
			
				System.out.println(driver.getTitle());
			}
			
			
		}

	}


