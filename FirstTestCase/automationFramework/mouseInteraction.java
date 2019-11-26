import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseInteraction {

	public static void main(String[] args) throws Exception {
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://webflow.com/interactions-animations");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Features')]"))).build().perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Why Webflow')]"))).build().perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Resources')]"))).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
