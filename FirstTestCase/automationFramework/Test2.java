import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String args[]) throws Exception {
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.name("username")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.quit();		
	}
	
}
