package com.Testng.practice;

import org.testng.annotations.Test;
public class PracticeTest {
	@Test(priority=1)
public  void Test1()
{
System.out.println("welcome to Jenkins Build 2");

}
	@Test(invocationCount = 2 ,priority=2)
	public  void Test2()
	{
		String url = System.getProperty("URL");
		String browser = System.getProperty("BROWSER");
		System.out.println("browser====>"+browser);
		System.out.println("tyss=====>"+url);
		System.out.println("hello");
	System.out.println("welcome to test2");
}
	@Test(enabled=false )
	public  void Test3()
	{
	System.out.println("welcome to america");
	System.out.println("Welcome to Banglore");
	}
}
