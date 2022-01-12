package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)   //constructor
	{
		PageFactory.initElements(oBrowser,this);
	}
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//Login Button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//minimize flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Logout Link
	@FindBy(linkText="Logout")  
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}
