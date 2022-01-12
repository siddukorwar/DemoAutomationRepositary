package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrpwserDemo1 {
	
		private static  WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			closeapplication();

		}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.gecko.driver","E:\\Examplenot\\AUTOMATION\\Web-automation\\Library\\Driver\\geckodriver.exe");
				oBrowser = new  FirefoxDriver();
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
				Thread.sleep(4000);
				System.out.println("naviagted to acti tym");

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

	
