package com.pagemodel.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteCustomer {

	public static WebDriver oBrowser=null;
	public static ActiTimeDemo1 opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		createcustomer();
		modifycustomer();
		deletecustomer();
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
	private static void createcustomer()
	{
		try
		{
			opage.getTask().click();
			Thread.sleep(2000);
			opage.getADDTask().click();
			Thread.sleep(2000);
			opage.getcustomer().click();
			Thread.sleep(2000);
			opage.getCustomerName().sendKeys("KGF");
			Thread.sleep(2000);
			opage.getCustomerDescription().sendKeys("Collected 1500 crore worldwide and became a pan india blockbuster movie");
			Thread.sleep(2000);
			opage.getCreatecustomer().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer()
	{
		try
		{
			opage.getSetting().click();
			Thread.sleep(4000);
			opage.getmodifydecription().clear();
			Thread.sleep(2000);
			opage.getmodifydecription().sendKeys("Collected 1500 crore worldwide and became a pan india blockbuster movie and become lifetime collected movies pof yash");
			Thread.sleep(4000);
			opage.getSetting().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deletecustomer()
	{
		try
		{
			opage.getseting2().click();
			Thread.sleep(4000);
			opage.getActionButton().click();
			Thread.sleep(2000);
			opage.getDeleteCustomer().click();
			Thread.sleep(2000);
			opage.getConfirmonCustDelete().click();
			Thread.sleep(4000);
			

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