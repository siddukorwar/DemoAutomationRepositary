package com.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static WebDriver oBrowser=null;
	public static MainPmg oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Examplenot\\AUTOMATION\\Web-automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new MainPmg(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:84/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogIn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimize()
	{
		try
		{
			oPage.minimizeFlyoutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getClickOnTasks().click();
			Thread.sleep(2000);
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getCeateNewcustomer().click();
			Thread.sleep(2000);
			oPage.getWriteCustomerName().sendKeys("Customer1");
			oPage.getCreateButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		static void modifyCustomer()
		{
			try 
			{
				oPage.getdeleteButton().click();
				Thread.sleep(2000);
				oPage.getNameField().click();
				Thread.sleep(2000);
				oPage.getClearName().clear();
				
				oPage.getModifyName().sendKeys("Maximus1");
				oPage.getdeleteButton().click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	static void deleteCustomer()
	{
		try
		{
			oPage.getdeleteButton().click();
			Thread.sleep(2000);
			oPage.getActionsButton().click();
			Thread.sleep(2000);
			oPage.getDeleteButton1().click();
			Thread.sleep(2000);
			oPage.getDeleteButton2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}