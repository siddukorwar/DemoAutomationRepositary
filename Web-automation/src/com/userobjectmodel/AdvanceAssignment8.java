package com.userobjectmodel;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssignment8 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		
		login();
		minimizeFlyoutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		
		loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		
		loginAdminModifyUsers();
		modifyUser1();
		modifyUser2();
		modifyUser3();
		logoutAdminModifyUsers();
		
		modifyUser1Login();
		modifyUser1Logout();
		modifyUser2Login();
		modifyUser2Logout();
		modifyUser3Login();
		modifyUser3Logout();
		
		deleteLoginAdmin();
		deletUser1();
		deleteUser2();
		deleteUser3();
		deletUserLogout();
		
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo2@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/*Login Users
	 * 
	 */
	static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*2:Modify Password:
	 * 
	 */
	 static void loginAdminModifyUsers()
	 {
		 try
		 {
			 oBrowser.findElement(By.name("username")).sendKeys("admin");
			 
			 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			 
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
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
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			 oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			 oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();		
		 }
	 }
	 static void modifyUser2()
	 {
		 try
		 {
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			 oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			 oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();		
		 }
	 }
	 static void logoutAdminModifyUsers()
	 {
		 try
		 {
			 oBrowser.findElement(By.linkText("Logout")).click();
			 Thread.sleep(4000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 /*3: ModifyLogin
	  * 
	  */
	 static void modifyUser1Login()
	 {
		 try
		 {
			 oBrowser.findElement(By.name("username")).sendKeys("user1");
			 oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void modifyUser1Logout()
	 {
		 try
		 {
			 oBrowser.findElement(By.linkText("Logout")).click();
			 Thread.sleep(4000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 static void modifyUser2Login()
	 {
		 try
		 {
			 oBrowser.findElement(By.name("username")).sendKeys("user2");
			 oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void modifyUser2Logout()
	 {
		 try
		 {
			 oBrowser.findElement(By.linkText("Logout")).click();
			 Thread.sleep(4000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 static void modifyUser3Login()
	 {
		 try
		 {
			 oBrowser.findElement(By.name("username")).sendKeys("user3");
			 oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void modifyUser3Logout()
	 {
		 try
		 {
			 oBrowser.findElement(By.linkText("Logout")).click();
			 Thread.sleep(4000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 /*Delete Users
	  * 
	  */
	 static void deleteLoginAdmin()
	 {
		 try
		 {
			 oBrowser.findElement(By.name("username")).sendKeys("admin");
			 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			 oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void deletUser1()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			 Thread.sleep(2000);
			 Alert oAlert=oBrowser.switchTo().alert();
			    String str=oAlert.getText();
			    System.out.println(str);
			    oAlert.accept();
			    Thread.sleep(3000);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 static void deleteUser2()
	 {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	 static void deletUserLogout()
	 {
		 try
		 {
			 oBrowser.findElement(By.linkText("Logout")).click();
			 Thread.sleep(4000);
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
