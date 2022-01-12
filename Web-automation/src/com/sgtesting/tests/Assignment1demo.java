package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1demo  {
	private static WebDriver oBrowser=null;
	public static void main (String args[]) {
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createUser();
		deleteUser();
	}
		
	private static  void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:84/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		
	}catch(Exception e)
		{
		e.printStackTrace();
		}
}

private static void createUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void deleteUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		String strContent=oAlert.getText();
		System.out.println(strContent);
		oAlert.accept();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}