package com.crm.CampaignTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.GenericLib.ExcelLib;

public class CampaignTest {
	ExcelLib eLib= new ExcelLib();
	
	@Test
	public void CreateCampaignTest() throws Throwable {
		//Read data from excel
		String uName=eLib.getExcelData("Sheet1", 1,1);
		String pwd=eLib.getExcelData("Sheet1", 1,2);
		String campName=eLib.getExcelData("Sheet1", 1,3);
		//Step1:  Login to App
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		
		//login
		driver.findElement(By.id("userName")).sendKeys(uName);
		driver.findElement(By.id("passWord")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
		
		//Step 3: Create Campaign
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("property(Campaign Name)")).sendKeys(campName);
		driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
		
		//Step4: Verify Campaign Details
		String actCampName=driver.findElement(By.id("value_Campaign Name")).getText();
		Assert.assertEquals(actCampName, campName,campName+ " is nt verified=======> FAIL");
		System.out.println(campName+" = is verified========> Pass");
	}
}
