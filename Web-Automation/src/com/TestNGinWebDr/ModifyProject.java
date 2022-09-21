package com.TestNGinWebDr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyProject {
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
	@Test(priority = 5,dataProvider = "getcustomer")
	private static void createcustomer(String name,String desc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(desc);
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6,dataProvider = "getproject")
	private static void createproject(String proj,String projdesc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).sendKeys(proj);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectDescriptionField\"]")).sendKeys(projdesc);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7,dataProvider = "getmodifyproject")
	private static void modifyproject(String modifydescproj)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys(modifydescproj);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	private static void deleteproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);       
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	private static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitBtn")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
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
	public Object[][] getcustomer()
	{
		return new Object[][]
				{
			{"KGF","Collected 1500 crore worldwide and became a pan india blockbuster movie"}
				};
	}
	@DataProvider
	public Object[][] getproject()
	{
		return new Object[][]
				{
			{"VikranthRona","it collected 200crore worldwide"}
				};
	}
	@DataProvider
	public Object[][] getmodifyproject()
	{
		return new Object[][]
				{
			{"It become highest collection in sudeep career"}
				};
	}
}


