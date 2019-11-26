import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLinkedin {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Linkedin");
		search.submit();
		
		//driver.findElement(By.partialLinkText("LinkedIn India")).click();
		driver.findElement(By.xpath("//*[contains(text(),'LinkedIn India')]")).click();
		
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jain.nalinjain@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("NaveenPoonam2111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("shashank pundir");
		
		driver.findElement(By.xpath("//*[contains(text(),'Jobs')]")).click();
		Thread.sleep(2000);
		WebElement box1 = driver.findElement(By.cssSelector("input.jobs-search-box__text-input"));
		box1.click();
		box1.sendKeys("Test Engineer");
		
		driver.findElement(By.cssSelector("button[class*='jobs-search-box']")).click();
		
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"ember16018\"]/li"));
		
	
//		List<WebElement> links = ele.findElements(By.xpath(""))
//		int linkcount = links.size(); 
//	    System.out.println(links.size()); 
//	    for(WebElement we : links) {
//	        System.out.println(we.getAttribute("href"));
//	    }
		//System.out.println(ele.getAttribute("class"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='profile-nav-item']//div[@class='nav-item__content']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign out")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
