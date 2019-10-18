import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
	@Test
	public static void main(String args[]) throws Exception
	{ 
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		*/
		
		///////////////////////////////
		/*
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		*/
		driver.get("https://youtube.com");
		driver.get("https://google.com");
		driver.navigate().back();
		driver.wait(1000);
		//driver.navigate().forward();
		driver.wait(1000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit(); //close the browser
	}
}
