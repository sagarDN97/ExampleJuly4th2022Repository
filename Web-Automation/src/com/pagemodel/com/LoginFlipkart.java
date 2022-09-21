package com.pagemodel.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlipkart {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		NoOfLinks();
		DisplayLinks();
		clickonlink();
		
		
	}
	public static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
          oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
		    oBrowser.manage().window().maximize();	
			oBrowser.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7411011954");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Ashok@123");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//button[@*='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void NoOfLinks()
	{
		try
		{
			List<WebElement> FLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of links:"+FLinks.size());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void DisplayLinks()
	{
		try
		{
			List<WebElement> FLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for (int i = 0; i <FLinks.size(); i++)
			{
				String flip=FLinks.get(i).getText();
				System.out.println(flip);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void clickonlink()
	{
		try
		{
			List<WebElement>FLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for (int i = 0; i <FLinks.size(); i++)
			{
				String flip=FLinks.get(i).getText();
				if(flip.startsWith("Hand Wash"))
				{
					FLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
