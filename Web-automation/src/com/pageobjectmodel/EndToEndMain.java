package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndToEndMain {
	public EndToEndMain(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	//Username WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//Login
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	public WebElement getLogIn()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement minimizeFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Click On Users
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oClick;
	public WebElement clickOnUsers()
	{
		return oClick;
	}
	
	//Add Users
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]") 
	private WebElement addU;
	public WebElement addUsers()
	{
		return addU;
	}
	
	private WebElement userDataLightBox_firstNameField;
	public WebElement clickOnFirstName()
	{
		return userDataLightBox_firstNameField;
	}
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement clickOnLastname()
	{
		return userDataLightBox_lastNameField;
	}
	
	private WebElement userDataLightBox_emailField;
	public WebElement emailFeild()
	{
		return userDataLightBox_emailField;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement userNameFelid()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement userDataLightBox_passwordField;
	public WebElement pass()
	{
		return userDataLightBox_passwordField;
	}
	
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement retypePass()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement submitButton()
	{
		return userDataLightBox_commitBtn;
	}
	//Start exploring Button
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement button;
	public WebElement getClickOnStartExporing()
	{
		return button;
	}
	//Logout Link
		@FindBy(linkText="Logout")  
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}
	//Modify Users:
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")    //*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]
		private WebElement clickOnUser1;
		public WebElement getUser1()
		{
			return clickOnUser1;
		}
		
		@FindBy(xpath=" //*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")   
		private WebElement clickOnUser2;
		public WebElement getUser2()
		{
			return clickOnUser2;
		}
		
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")   
		private WebElement clickOnUser3;
		public WebElement getUser3()
		{
			return clickOnUser3;
		}
		
		private WebElement password;
		public WebElement getWritePass()
		{
			return password;
		}
		private WebElement passwordCopy;
		public WebElement getWritePass2()
		{
			return passwordCopy;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement saveButton;
		public WebElement getSaveChanges()
		{
			return saveButton;
		}
		
	//Delete Users
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement delete;
	public WebElement d1User1()
	{
		return delete;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement d2User1()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")
	private WebElement deletU2;
	public WebElement getUser2ToDelete()
	{
		return deletU2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")
	private WebElement deletU3;
	public WebElement getUser3ToDelete()
	{
		return deletU3;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")
	private WebElement dell3;
	public WebElement getAgainUser3toDelete()
	{
		return dell3;
	}
}
