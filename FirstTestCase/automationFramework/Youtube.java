import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Youtube {
	@Test
	public static void main(String args[]) throws Exception
	{
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.youtube.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(1000);
		jse.executeScript("scroll(1000, 600);");
		Thread.sleep(1000);
		jse.executeScript("scroll(600, 0);");
		
		Thread.sleep(5000);
		driver.quit(); //close the browser
	}
}
