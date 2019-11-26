import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSibling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		Thread.sleep(1000);
		driver.quit();

		}

}
