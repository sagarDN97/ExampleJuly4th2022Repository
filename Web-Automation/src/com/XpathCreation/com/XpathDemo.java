package com.XpathCreation.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		//absolutexpath();
		//RLTxpathusingTagname();
		//RLTxpathusingIndex();
		 //RLTxpathAttributeWithValue();
		//RLTxpathTagnameWithAttributeNameValueComb();
		//RLTxpathTagnameWithAttributeNameValueAlone();
		//RLTxpathTagnameWithMultipleAttributeNameValue();
		//RLTxpathTagnameWithMultipleAttributeNameValueUsingAND();
		//RLTxpathTagnameWithMultipleAttributeNameValueUsingOR();
		//RLTPartialMatchingOfAttributeValueStartsEndsWith();
		//RLTTagenameWithAttributeCombn();
		//RLTTagenameWithAttributeCombn1();
		//RLTTagenameWithAttributeCombn2();
		//RLTUsingTextContentIdentifyElement();
		RLTPartialMatchingofTextContentStartsEndsWith();

	}
	private static void launchbrowser()
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
	private static void navigate()
	{
		try 
		{
			oBrowser.get("file:///C:/HTML/Sample.html");

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absolutexpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input[2]")).sendKeys("Demouser1");
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathusingTagname()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input")).sendKeys("Demouser1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathusingIndex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Vikram");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathAttributeWithValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathTagnameWithAttributeNameValueComb()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathTagnameWithAttributeNameValueAlone()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathTagnameWithMultipleAttributeNameValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@id='btn1submit1button1'][@class='submit1btn1']")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathTagnameWithMultipleAttributeNameValueUsingAND()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTxpathTagnameWithMultipleAttributeNameValueUsingOR()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void RLTPartialMatchingOfAttributeValueStartsEndsWith()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
			oBrowser.findElement(By.xpath("//input[contains(@name,'bmi')]")).click();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void RLTTagenameWithAttributeCombn()
	//no of links
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of links in page:"+oLinks.size());
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void RLTTagenameWithAttributeCombn1()
	//display no of links
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for (int i = 0; i <oLinks.size(); i++)
			{
			String linkname=oLinks.get(i).getText();
			System.out.println(linkname);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void RLTTagenameWithAttributeCombn2()
	//click operation on specific links
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for (int i = 0; i <oLinks.size(); i++)
			{
			String linkname=oLinks.get(i).getText();
			if(linkname.startsWith("POI"))
			{
				oLinks.get(i).click();
				break;
			}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	private static void RLTUsingTextContentIdentifyElement()
	{
		try
		{
		oBrowser.findElement(By.xpath("//a[text()='SeleniumHQ']")).click();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void RLTPartialMatchingofTextContentStartsEndsWith()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
			oBrowser.findElement(By.xpath("//a[contains(text(),'Tool')]")).click();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
