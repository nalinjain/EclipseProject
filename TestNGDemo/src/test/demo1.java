package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class demo1 {
	
	@AfterTest
	public void LastExec()
	{
		System.out.println("#Last Execution");
	}
	
	@Test
	public void Democlass1() 
	{
		System.out.println("hi");
	}
	
	@Test(groups= {"Smoke"})
	public void Democlass2() 
	{
		System.out.println("Hello World!");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("#LAST");
	}
	
	@AfterClass
	public void AfClass()
	{
		System.out.println("After Class********");
	}

}

