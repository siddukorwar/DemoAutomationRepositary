package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutfirefoxwebBrowser {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Logout();
		close();
	}
	private static void launchbrowser()
	{

		try 
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",path+"\\Library\\Driver\\geckodriver.exe");
			obrowser=new FirefoxDriver();

		}
		catch(Exception e)

		{
			e.printStackTrace();;
		}
	}
	private static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost:84/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void Logout()
	{
		try
		{
			obrowser.findElement(By.id("logout")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close() 
	{
		try {

			obrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}











