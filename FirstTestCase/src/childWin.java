import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWin {

	public static void main(String[] args) throws Exception {

		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_opener");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
