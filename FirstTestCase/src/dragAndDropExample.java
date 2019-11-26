import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropExample {

	public static void main(String[] args) throws Exception {
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 600);");
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement des = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Thread.sleep(1000);
		a.dragAndDrop(source, des).build().perform();
		
		WebElement from = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Thread.sleep(1000);
		a.dragAndDrop(from,to).build().perform();
				
		Thread.sleep(2000);
		driver.quit();
		
	}

}
