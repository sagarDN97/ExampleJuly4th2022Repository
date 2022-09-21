package com.pagemodel.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginlogoutDemo {
 public static WebDriver oBrowser=null;
  public static ActiTimeDemo1 opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimzeflywindow();
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
