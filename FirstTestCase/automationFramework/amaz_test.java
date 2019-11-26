import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class amaz_test {

	public static void main(String[] args) throws Exception {
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		if (title == "Robot Check") {
			System.out.println("not possible");
			driver.close();
		}
		Thread.sleep(1000);
		
		//Signin
		driver.findElement(By.xpath("//*[contains(text(),\"Hello. Sign in\")]")).click();
		WebElement id = driver.findElement(By.cssSelector("#ap_email"));
		id.sendKeys("8126805818");
		id.sendKeys(Keys.ENTER);
		WebElement pwd = driver.findElement(By.cssSelector("#ap_password"));
		pwd.sendKeys("Nalin@nj95");
		pwd.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		 
		//Searching items
		WebElement searchbar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Mobiles");
		searchbar.sendKeys(Keys.ENTER);
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]")).click();
		
		//listing all tabs/windows
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parentid=it.next();
		String childid=it.next();
		
		//switching to new tab
		driver.switchTo().window(childid);
		
		//adding item to cart
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		//driver.findElement(By.xpath("//a[@id=\"attach-close_sideSheet-link\"]")).click();
		
		//closing current tab
		driver.close();
		
		driver.switchTo().window(parentid);
		
		//Signout
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),\"Account & Lists\")]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		
		//back to main page
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']")).click();
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
