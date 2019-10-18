import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class openURL {
	@Test
	public static void main(String args[]) throws Exception
	{
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //to maximise the window
		
		driver.get("http://www.google.com"); //to open a URL
		
		WebElement elem1 = driver.findElement(By.name("q"));//finding the web element using name locator
		elem1.sendKeys(new String[]{"selenium"});
		elem1.submit();
		Thread.sleep(1000);
		
		WebElement elem2 = driver.findElement(By.name("q"));
		elem2.clear();
		elem2.sendKeys(new String[]{"happiest minds"});
		elem2.submit();
		Thread.sleep(5000);
		String at = driver.getTitle();
		System.out.println(at);

		//String a = "window.open('about:blank','_blank');";
		((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank');");
		Thread.sleep(2000);
	/*
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open('about:blank','_blank');");
		Thread.sleep(2000);
		*/
		
		driver.quit(); //close the browser
	}
}
