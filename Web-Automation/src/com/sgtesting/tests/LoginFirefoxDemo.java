package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFirefoxDemo {
  public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launch();
		navigate();
		login();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:8082/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.linkText("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
