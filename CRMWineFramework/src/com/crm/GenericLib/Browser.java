package com.crm.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static WebDriver driver;

public static WebDriver getBrowser(){
	if(Constant.browser.equals("firefox")){
	//	System.setProperty("WebDriver.firefox.driver","C:\\Program Files (x86)\\sjar\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	else if(Constant.browser.equals("chrome")){
		System.setProperty("WebDriver.chrome.driver","C:\\Program Files (x86)\\sjar\\chromedriver.exe");

		driver=new ChromeDriver();
	}
	return driver;
			
}
}
