package com.testPackage_1;

import org.testng.annotations.Test;

public class TestClass_1_P1 {

	@Test(priority=2,invocationCount=3,groups= {"gets"})
	public void Display()
	{
		System.out.println("class 1 Display from pacakge 1");
	}
	
	@Test(timeOut=2)
	public void show() throws InterruptedException
	
	{
		Thread.sleep(10000);
		System.out.println("class 1 show from pacakge 1");
	}
	
	@Test(dependsOnMethods="show")
	public void view()
	{
		System.out.println(" class 1 view  from pacakge 1");
	}
	
}
