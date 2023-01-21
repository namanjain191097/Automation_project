import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			driver.navigate().to("https://rahulshettyacademy.com");
			Thread.sleep(4000);
			driver.navigate().back();

	}

}
