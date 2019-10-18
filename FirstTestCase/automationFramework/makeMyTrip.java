import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) throws Exception {

		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");
		System.out.println("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
		driver.quit();
		
		
	}

}
