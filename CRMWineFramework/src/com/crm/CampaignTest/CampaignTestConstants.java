package com.crm.CampaignTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericLib.Browser;
import com.crm.GenericLib.Constant;
import com.crm.GenericLib.ExcelLib;
import com.crm.GenericLib.WebDriverCommonLib;

public class CampaignTestConstants {
	ExcelLib elib=new ExcelLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	
	@Test(priority=1)
	public void CreateCampaignTest() throws Throwable {
		ExcelLib elib=new ExcelLib();
		//Read data from excel
		String uName=Constant.userName;
		String pwd=Constant.passwrd;
		String campName=elib.getExcelData("Sheet1", 1,2);
		//Step1:  Login to App
		WebDriver driver=Browser.getBrowser();
		driver.get(Constant.url);
	/*	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click(); */
		driver.findElement(By.id("userName")).sendKeys(uName);
		driver.findElement(By.id("passWord")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='image']")).submit();
		wlib.waitforElementPresent(driver.findElement(By.linkText("Campaigns")));
		
		//Step2: Navigate to Campaign Page
		driver.findElement(By.linkText("campaigns")).click();
		//Step3: Create Campaigns
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		driver.findElement(By.name("property(Campaign Name)")).sendKeys(campName);
		driver.findElement(By.xpath("//input[@value='Save'][1]")).click();
		
		//Step 4: Verify Campaign Details
		String actCampName=driver.findElement(By.id("value_Campaign Name")).getText();
		
		Assert.assertEquals(actCampName, campName,campName+" is not verified == Fail");
		System.out.println(campName+" is verified == Pass");
		driver.close();
	}
	@Test(priority=2)
	public void searcgCampaignTest() throws Throwable 
	{
		//read data from file
		String userName=Constant.userName;
		String passWord=Constant.passwrd;
		String CampName=elib.getExcelData("Sheet1", 4, 1);
		
		// login to APP
		WebDriver driver= Browser.getBrowser();
		wlib.waitforPageLoad();
		driver.get(Constant.url);
		driver.findElement(By.id("userName")).sendKeys(userName);
		driver.findElement(By.id("passWord")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='image']")).click();
		
		//Step2: Search above Campaign
		wlib.select(driver.findElement(By.id("searchCategory")), 5);
		driver.findElement(By.id("searchword")).sendKeys(CampName);
		driver.findElement(By.xpath("//input[@id='searchword']/following-sibling::input"));
		
		//Verify Campaign
		boolean campLinkName=driver.findElement(By.linkText(CampName)).isDisplayed();
		Assert.assertTrue(campLinkName);
		driver.close();
		
	}
}
