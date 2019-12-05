package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo4 {

	@Test(groups= {"Smoke"})
	public void WebCarLoan()
	{
		System.out.println("Web Car Loan Login");
	}
	
	@Test
	public void MobCarLoan()
	{
		System.out.println("Mob Car Loan Login");
	}
	
	@AfterTest
	public void EndExec()
	{
		System.out.println("last :)");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("#BEFORE");
	}
	
	@AfterMethod
	public void AfMethod()
	{
		System.out.println("AFTER METHOD");
	}
}
