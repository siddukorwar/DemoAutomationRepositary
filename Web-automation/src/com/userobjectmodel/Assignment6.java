package com.userobjectmodel;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment6 {

				private static ChromeDriver oBrowser;

				public static void main(String[] args) {

				WebDriver oBrowser=null;
					launchBrowser();
					navigate();
					login();
					minimizeFlyOutWindow();
					createcustomer();
					createproject();
					modifyproject();
					deleteproject();
					deletecustumer();
					logout();
					closeApplication();
				}
				
				private static void launchBrowser()
				{
					try
					{
						String path=System.getProperty("user.dir");
						System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
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
						oBrowser.navigate().to("http://localhost:84/login.do");
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
						oBrowser.findElement(By.id("username")).sendKeys("admin");
						oBrowser.findElement(By.name("pwd")).sendKeys("manager");
						oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
						oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
						oBrowser.findElement(By.linkText("Logout")).click();
						Thread.sleep(2000);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
				private static void closeApplication()
				{
					try
					{
						oBrowser.close();
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
				private static void createcustomer()
				{
					try
					{
						oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("demo");
						oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("i am good");
						oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
						Thread.sleep(2000);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}	
				private static void createproject()
				{
					try
					{
						oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("javaproject");
						oBrowser.findElement(By.className("x-btn-text")).sendKeys("demo");
						oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
						Thread.sleep(2000);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
				private static void modifyproject()
				{
					try
					{
						oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.className("task_list with-navigation navBottomSpaceHidden  ext-chrome")).sendKeys("project script");
						
						
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				private static void deleteproject()
				{
					try
					{
						oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
						Thread.sleep(2000);
						
						
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				private static void deletecustumer()
				{
					try
					{
						oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
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
