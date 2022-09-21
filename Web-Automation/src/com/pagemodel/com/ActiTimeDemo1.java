package com.pagemodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo1
{
	public ActiTimeDemo1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement  getpassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement createuser;
	public WebElement getuser()
	{
		return createuser;
	}
	@FindBy(xpath=("//*[@id=\"createUserDiv\"]/div"))
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getemail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getloginusername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpasswordofname()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getcopypasswordofname()
	{
		return userDataLightBox_passwordCopyField;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement getcreateuserfinal()
	{
		return userDataLightBox_commitBtn;
	}
	@FindBy(xpath=("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table"))
	private WebElement clickcreateduser;
	public WebElement getclickingcreateduser()
	{
		return clickcreateduser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuserbutton()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath=("//*[@id=\"userDataLightBox_commitBtn\"]/div/span"))
	private WebElement clicksavechanges;
	public WebElement getclicksavechanges()
	{
		return clicksavechanges;
	}
	@FindBy(xpath=("//*[@id=\"topnav\"]/tbody/tr/td[3]/a"))
	private WebElement clickonTask;
	public WebElement getTask()
	{
		return clickonTask;
	}
	@FindBy(xpath=("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]"))
	private WebElement clickonAddtask;
	public WebElement getADDTask()
	{
		return clickonAddtask;
	}
	@FindBy(xpath=("/html/body/div[14]/div[1]"))
	private WebElement clickoncustomer;
	public WebElement getcustomer()
	{
		return clickoncustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerDescription()
	{
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath=("//*[@id=\"customerLightBox_commitBtn\"]/div/span"))
	private WebElement clickonCreateCustomer;
	public WebElement getCreatecustomer()
	{
		return clickonCreateCustomer;
	}
	@FindBy(xpath=("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
	private WebElement clickonsetting;
	public WebElement getSetting()
	{
		return clickonsetting;
	}
	@FindBy(xpath=("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div"))
	private WebElement clickonaction;
	public WebElement getActionButton()
	{
		return clickonaction;
	}
	@FindBy(xpath=("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div"))
	private WebElement clickondeletecustomer;
	public WebElement getDeleteCustomer()
	{
		return clickondeletecustomer;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getConfirmonCustDelete()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath=("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea"))
	private WebElement modifycustomerdecript;
	public WebElement getmodifydecription()
	{
		return modifycustomerdecript;
	}
	@FindBy(xpath=("/html/body/div[14]/div[2]"))
	private WebElement addproject;
	public WebElement getaddProject()
	{
		return addproject;
	}
	private WebElement 	projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	private WebElement 	projectPopup_projectDescriptionField;
	public WebElement getProjectDescription()
	{
		return projectPopup_projectDescriptionField;
	}
	@FindBy(xpath=("//*[@id=\'projectPopup_commitBtn\']/div/span"))
	private WebElement saveproject;
	public WebElement saveButtonProject()
	{
		return saveproject;
	}
	@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]"))
	private WebElement settingbutton;
	public WebElement getsettingproject()
	{
		return settingbutton;
	}
	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]"))
	private WebElement actionbuttonproj;
	public WebElement projectAction()
	{
		return actionbuttonproj;
	}

	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div"))
	private WebElement deleteproject;
	public WebElement deleteprojectbutton()
	{
		return deleteproject;
	}

	private WebElement 	projectPanel_deleteConfirm_submitTitle;
	public WebElement getDeleteConfirmProj()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
	private WebElement settingbutton2;
	public WebElement getseting2()
	{
		return settingbutton2;
	}
	@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]"))
	private WebElement settingbutton3;
	public WebElement getsetingProject()
	{
		return settingbutton3;
	}
	
	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea"))
	private WebElement modifydecriptionofproject;
	public WebElement getmodifyprojectdecription1()
	{
		return modifydecriptionofproject;
	}
	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]"))
	private WebElement projecttask;
	public WebElement getprojecttaskbutton()
	{
		return projecttask;
	}
	@FindBy(xpath=("/html/body/div[13]/div[1]"))
	private WebElement projectnewtask;
	public WebElement getprojectnewtaskbutton()
	{
		return projectnewtask;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input"))
	private WebElement taskname1;
	public WebElement getprojecttaskname1()
	{
		return taskname1;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input"))
	private WebElement taskname2;
	public WebElement getprojecttaskname2()
	{
		return taskname2;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input"))
	private WebElement taskname3;
	public WebElement getprojecttaskname3()
	{
		return taskname3;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input"))
	private WebElement taskname4;
	public WebElement getprojecttaskname4()
	{
		return taskname4;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input"))
	private WebElement taskname5;
	public WebElement getprojecttaskname5()
	{
		return taskname5;
	}
	@FindBy(xpath=("//*[@id=\'createTasksPopup_commitBtn\']/div/span"))
	private WebElement savetask;
	public WebElement getsaveTasks()
	{
		return savetask;
	}
	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div"))
	private WebElement selectalltaskbutton;
	public WebElement getprojectSELECTalltask()
	{
		return selectalltaskbutton;
	}
	@FindBy(xpath=("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]"))
	private WebElement deletealltask;
	public WebElement projectDELETEselectedTask()
	{
		return deletealltask;
	}
	private WebElement 	deleteTaskPopup_deleteConfirm_submitBtn;
	public WebElement projecttaskConfirmDelete()
	{
		return deleteTaskPopup_deleteConfirm_submitBtn;
	}
	
	
	
}
