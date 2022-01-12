package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cromebrowserdemo {
	private static  WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//	closeapplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Examplenot\\AUTOMATION\\Web-automation\\Library\\Driver\\chromedriver.exe");
			oBrowser = new  ChromeDriver();
			System.out.println("Broswer is lauanched ");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:84/login.do");
			Thread.sleep(6000);
			System.out.println("web browser");

		}
		catch (Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();

		}
		catch (Exception e)

		{
			e.printStackTrace();
		}
	}


}