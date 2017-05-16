package com.crm.ContactTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.CampaignTest.CampaignTest;
import com.crm.GenericLib.Browser;

public class CreateContactTest {
	Logger log=Logger.getLogger(CampaignTest.class);
@Test
public void CContactTest()
{
	WebDriver driver=Browser.getBrowser();
	driver.get("https://gmail.com");
	Reporter.log("Step1: Login to CRM");
	Reporter.log("Step 2: Navigate to contact");
	Reporter.log("Step 3: Create Contact");
	Reporter.log("Step 4: Verify Contact");
	Assert.assertEquals("A", "B");
	Reporter.log("Step 5: Logout");
	Reporter.log("==========================================");
}
@Test
public void modifyContactTest()
{
	WebDriver driver=Browser.getBrowser();
	driver.get("https://facebook.com");
	Assert.assertEquals("A", "B");

	Reporter.log("Step1: Login to CRM");
	Reporter.log("Step 2: Navigate to contact");
	Reporter.log("Step 3: Create Contact");
	Reporter.log("Step 4: Verify Contact");
	Reporter.log("Step 5: Logout");
	Reporter.log("==========================================");	
}
}
