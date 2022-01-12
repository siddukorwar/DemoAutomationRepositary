package com.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static WebDriver oBrowser=null;
	public static EndToEndMain oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
     	login();
		minimize();
		createUser1();
		createUser2();
		createUser3();
		logout();
		
		loginUser1();
		logout();
		loginUser2();
		logout();
		loginUser3();
		logout();
		
		login();
		
		modifyUser1();
		modifyUser2();
		modifyUser3();
		logout();   
		
		
		loginModifyUser1();
		logout();
		loginModifyUser2();
		logout();
		loginModifyUser3();
		logout();  
		
		login();
		
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logout();     
		
		closeApplication();  
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Examplenot\\AUTOMATION\\Web-automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new EndToEndMain(oBrowser);
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
	static void createUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFirstName().sendKeys("user1");
			oPage.clickOnLastname().sendKeys("Demo1");
			oPage.userNameFelid().sendKeys("user1");
			oPage.emailFeild().sendKeys("user1@gmail");
			oPage.pass().sendKeys("1234567890");
			oPage.retypePass().sendKeys("1234567890");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFirstName().sendKeys("user2");
			oPage.clickOnLastname().sendKeys("Demo2");
			oPage.userNameFelid().sendKeys("user2");
			oPage.emailFeild().sendKeys("user2@gmail");
			oPage.pass().sendKeys("1234567890");
			oPage.retypePass().sendKeys("1234567890");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFirstName().sendKeys("user3");
			oPage.clickOnLastname().sendKeys("Demo3");
			oPage.userNameFelid().sendKeys("user3");
			oPage.emailFeild().sendKeys("user3@gmail");
			oPage.pass().sendKeys("1234567890");
			oPage.retypePass().sendKeys("1234567890");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("1234567890");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStartExporing().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("1234567890");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStartExporing().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("1234567890");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			oPage.getClickOnStartExporing().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.getWritePass().sendKeys("1234567891");
			oPage.getWritePass2().sendKeys("1234567891");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
			
			oPage.getUser2().click();
			Thread.sleep(2000);
			oPage.getWritePass().sendKeys("1234567891");
			oPage.getWritePass2().sendKeys("1234567891");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser3()
	{
		try
		{
			
			oPage.getUser3().click();
			Thread.sleep(2000);
			oPage.getWritePass().sendKeys("1234567891");
			oPage.getWritePass2().sendKeys("1234567891");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("1234567891");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("1234567891");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("1234567891");
			oPage.getLogIn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			
			oPage.getUser1().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	{
		try
		{
			oPage.getUser2ToDelete().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser3()
	{
		try
		{
			oPage.getUser3ToDelete().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
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
	
}
