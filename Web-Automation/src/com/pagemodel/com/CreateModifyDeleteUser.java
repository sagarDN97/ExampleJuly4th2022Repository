package com.pagemodel.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteUser {

	public static WebDriver oBrowser=null;
	public static ActiTimeDemo1 opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimzeflywindow();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeapplication();
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTimeDemo1(oBrowser);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:8082/login.do");
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
			opage.getusername().sendKeys("admin");
			opage.getpassword().sendKeys("manager");
			opage.getLogin().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimzeflywindow()
	{
		try
		{
			opage.getFlyOutWindow().click();
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
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstname().sendKeys("sagar");
			Thread.sleep(2000);
			opage.getlastname().sendKeys("gowda");
			Thread.sleep(2000);
			opage.getemail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			opage.getusername().sendKeys("SagarDN");
			Thread.sleep(2000);
			opage.getpasswordofname().sendKeys("Welcomehome1");
			Thread.sleep(2000);
			opage.getcopypasswordofname().sendKeys("Welcomehome1");
			Thread.sleep(2000);
			opage.getcreateuserfinal().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			opage.getclickingcreateduser().click();
			Thread.sleep(2000);
			opage.getemail().clear();
			Thread.sleep(2000);
			opage.getemail().sendKeys("Appu@gmail.com");
			Thread.sleep(2000);
			opage.getclicksavechanges().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			opage.getclickingcreateduser().click();
			Thread.sleep(2000);
			opage.getdeleteuserbutton().click();
			Thread.sleep(2000);
			Alert oalrt=oBrowser.switchTo().alert();
			String cont=oalrt.getText();
			System.out.println(cont);
			oalrt.accept();
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
			opage.getLogoutLink().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

	


