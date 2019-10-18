import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_test {
	
	public static void main(String[] args) throws Exception 
	{
		
		//Setting property for drivers		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		//Maximizing the window size
		driver.manage().window().maximize();
				
		//Navigating to facebook page
		driver.get("https://www.facebook.com/");
		
		//WebDriver wait to load all elements
		driver.wait(3000);
		// Thread.sleep(3000);
		 
		//Test Case 1(Correct username and password)
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcdef");
		driver.findElement(By.id("u_0_q")).click();
		
		/*
		//Test Case 2(Incorrect username and Incorrect password)
		driver.findElement(By.name("email")).sendKeys("pqr@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pq11");
		driver.findElement(By.id("u_0_q")).click();
		*/
		
		/*
		//Test Case 3(Correct username and incorrect password)
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pq11");
		driver.findElement(By.id("u_0_q")).click();
		*/
		
		//Webdriver exits
		driver.quit();
		}
}
