import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\Users\\Nalin.jain\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		
		
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("AED");
		Thread.sleep(1000);
		s.selectByVisibleText("USD");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Select pax = new Select( driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		pax.selectByIndex(3);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Kochi (COK)')]")).click();
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
