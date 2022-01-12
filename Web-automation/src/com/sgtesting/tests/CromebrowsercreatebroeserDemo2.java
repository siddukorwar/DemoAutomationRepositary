package com.sgtesting.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromebrowsercreatebroeserDemo2 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launchbrowser();
		naviagate();
		login();
		createuser();
		//Modifyuser();
		//Deleteuser();
		//logout();
		//close();
	}
	private static void Launchbrowser() {
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();	
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void naviagate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:84/login.do");
			Thread.sleep(5000);

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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add user']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstname")).sendKeys("user2");
			oBrowser.findElement(By.name("lastname")).sendKeys("Demo2");
			oBrowser.findElement(By.name("email")).sendKeys("Demoa@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("user2Demo2");
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			oBrowser.findElement(By.xpath("//span[text()='userDataLigthBox']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			
			oBrowser.findElement(By.xpath("//div[text()='Add user']")).click();
			oBrowser.findElement(By.name("firstname")).sendKeys("product");
			oBrowser.findElement(By.name("lastname")).sendKeys("Details");
			oBrowser.findElement(By.name("email")).sendKeys("Demo123@gamil.com");
			oBrowser.findElement(By.name("useraname")).sendKeys("productDetails");
			oBrowser.findElement(By.name("password")).sendKeys("welcome1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser()
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
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close() 
	{
		try {

			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}


