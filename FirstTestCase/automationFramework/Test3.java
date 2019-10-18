import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String args[]) throws Exception {
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Already']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@id,'remember')]")).click();
		driver.findElement(By.cssSelector("input[title*='Sign']")).click();
		
		Thread.sleep(1000);
		driver.quit();
	}
	
}
