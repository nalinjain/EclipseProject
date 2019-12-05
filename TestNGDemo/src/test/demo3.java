package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo3 {
	
	@Test
	public void WebHomeLoan()
	{
		System.out.println("Web Home Loan Login");
	}
	
	@Test(groups= {"Smoke"})
	public void MobHomeLoan()
	{
		System.out.println("Mobile Home Loan Login");
	}
	
	@Test
	public void APIHomeLoan()
	{
		System.out.println("API Home Loan Login");
	}
	
	@BeforeTest
	public void FirstExec()
	{
		System.out.println("#first execution");
	}
	
	@BeforeMethod
	public void BfMethod()
	{
		System.out.println("BEFORE METHOD");
	}
	
	@BeforeClass
	public void BfClass()
	{
		System.out.println("Before Class **");
	}
}
