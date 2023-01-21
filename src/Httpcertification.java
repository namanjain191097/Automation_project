import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Httpcertification {

	public static void main(String[] args) {
System.setProperty("webdiver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
