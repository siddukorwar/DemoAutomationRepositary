package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPmg {
	public MainPmg(WebDriver oBrowser)
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
	
	//Logout Link
		@FindBy(linkText="Logout")  
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}
	//Modify User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement modify;
	public WebElement clickModiUser1()
	{
		return modify;
	}
	private WebElement firstName;
	public WebElement fnameUser1()
	{
		return firstName;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement saveButton;
	public WebElement saveChanges()
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
	
	//Create Customer : 
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement clickTasks;
	public WebElement getClickOnTasks()
	{
		return clickTasks;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
	private WebElement addnew;
	public WebElement getAddnewButton()
	{
		return addnew;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement create;
	public WebElement getCeateNewcustomer()
	{
		return create;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getWriteCustomerName()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement createButton;
	public WebElement getCreateButton()
	{
		return createButton;
	}
	
	//Modify Customer:
	 @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	 private WebElement namefield;
	 public WebElement getNameField()
	 {
		 return namefield;
	 }
	 @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	 private WebElement changeName;
	 public WebElement getModifyName()
	 {
		 return changeName;
	 }
	 
	 @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	 private WebElement clearName;
	 public WebElement getClearName()
	 {
		 return clearName;
	 }
	
	//Delete Customer :
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement delete1;
	public WebElement getdeleteButton()
	{
		return delete1;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actions;
	public WebElement getActionsButton()
	{
		return actions;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deleteButton1;
	public WebElement getDeleteButton1()
	{
		return deleteButton1;
	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
	private WebElement deleteButton2;
	public WebElement getDeleteButton2()
	{
		return deleteButton2;
	}
	//Create Project:
	//call getAddnewButton()
	
	@FindBy(xpath="/html/body/div[14]/div[2]")   
	private WebElement createP;
	public WebElement getNewProjectButton()
	{
		return createP;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getPNameField()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement pbutton;
	public WebElement getCreatePButton()
	{
		return pbutton;
	}
	//Delete Project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private  WebElement editButton;
	public WebElement getSettingButton()
	{
		return editButton;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement pactionB;
	public WebElement getPActionButton()
	{
		return pactionB;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement pDelete1;
	public WebElement getProjectDelete1()
	{
		return pDelete1;
	}
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
	private WebElement pDelete2;
	public WebElement getProjectDelete2()
	{
		return pDelete2;
	}
	
	//Modify Project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement textArea;
	public WebElement getDescription()
	{
		return textArea;
	}
	//Create Task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
	private WebElement taskb;
	public WebElement getAddTaskButton()
	{
		return taskb;
	}
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement ctask;
	public WebElement getCreateTask()
	{
		return ctask;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement enetert;
	public WebElement getTaskNameField()
	{
		return enetert;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement createt;
	public WebElement getCreateTaskButton()
	{
		return createt;
	}
	
	//Delete Task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div")  
	private WebElement taskClick;
	public WebElement getClickOnCheckBox()
	{
		return taskClick;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]") 
	private WebElement taskClick2;
	public WebElement getClickTask()
	{
		return taskClick2;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionT;
	public WebElement getTaskActionButton()
	{
		return actionT;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement deleteT1;
	public WebElement getTaskDelete()
	{
		return deleteT1;
	}
	@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitBtn\']/div")
	private WebElement deleteT2;
	public WebElement getConfirmTaskDelete()
	{
		return deleteT2;
	}
}
