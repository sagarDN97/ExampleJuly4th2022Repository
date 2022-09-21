package com.TestNGinWebDr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyUserTestNG {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver(); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			oBrowser.get("http://localhost:8082/login.do");
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider = "getlogindetails")
	private static void login(String adm,String man)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(adm);
			oBrowser.findElement(By.name("pwd")).sendKeys(man);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimizeflyoutwindow()
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
	@Test(priority=5,dataProvider = "getuserdetails")
	private static void createuser(String fn,String ln,String eml,String un,String pwd,String pwd1)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(ln);
			oBrowser.findElement(By.name("email")).sendKeys(eml);
			oBrowser.findElement(By.name("username")).sendKeys(un);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd1);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6,dataProvider = "modifyuser")
	private static void modifycustomer(String emil)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[3]/span")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys(emil);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		  	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	@Test(priority=8)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(dependsOnMethods = {"logout"})
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
	
	@DataProvider
	public Object[][] getlogindetails() 
	{
		return new Object[][] {
			{"admin","manager"}
		};
	}
	@DataProvider
	public Object[][] getuserdetails()
	{
		return new Object[][]
				{
			{"sagar","gowda","demo@gmail.com","SagarDN","Welcomehome1","Welcomehome1"}
				};
	}
	@DataProvider
	public Object[][] modifyuser()
	{
		return new Object[][]
				{{"appu@gmail.com"}
			
				};
	}

}

