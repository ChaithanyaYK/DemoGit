package com.crm.CampaignTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.GenericLib.Browser;
import com.crm.GenericLib.Constant;
import com.crm.GenericLib.ExcelLib;
import com.crm.GenericLib.WebDriverCommonLib;
import com.crm.pageObjectrepositorylib.AllCompaigns;
import com.crm.pageObjectrepositorylib.CampaignDetails;
import com.crm.pageObjectrepositorylib.Comman;
import com.crm.pageObjectrepositorylib.CreateCampaign;
import com.crm.pageObjectrepositorylib.HomePageLib;
import com.crm.pageObjectrepositorylib.LoginPageLib;

public class CampaignTestPageLib {
	
	public class CompaignTest {
		
		//object declaration
		ExcelLib eLib;
		WebDriver driver;
		LoginPageLib loginPAge;
		Comman comPage;
		HomePageLib homePage;
		AllCompaigns allCampPage;
		CreateCampaign createCampPage;
		CampaignDetails campDeatilsPAge;

		@BeforeClass
		public void configBeforeClass(){
			//object initialization
			eLib = new ExcelLib();
			driver = Browser.getBrowser();
			loginPAge = PageFactory.initElements(driver, LoginPageLib.class);
			comPage = PageFactory.initElements(driver, Comman.class);
			homePage = PageFactory.initElements(driver, HomePageLib.class);
			allCampPage = PageFactory.initElements(driver, AllCompaigns.class);
			createCampPage = PageFactory.initElements(driver, CreateCampaign.class);
			campDeatilsPAge = PageFactory.initElements(driver, CampaignDetails.class);
					
		}
		
		@BeforeMethod
		public void configBeforeMtd(){
			//login to App
			loginPAge.loginToCrm();		
		}
		

		@Test
		public void createcomapignTest() throws Throwable{
		   String compaignNAme = eLib.getExcelData("Sheet1", 1, 2);
		   //step 2 : navigate to Campaign Page
		   homePage.navigateToCampaignPage();
		   //step 3 : navigate to create Campaign Page
		   allCampPage.navigateToCreateNewCampPage();
		   //step 4 : create new Campaign
		   createCampPage.createCampaign(compaignNAme);
		   //step 5: verify camp in Campaign details PAge
		   String actComNAme = campDeatilsPAge.getComNAmedeatils().getText();
		   Assert.assertEquals(actComNAme, compaignNAme);
		}
		
		@Test
		public void createCampWithType()throws Throwable{
			String compaignNAme = eLib.getExcelData("Sheet1", 2, 2);
			String compaignType = eLib.getExcelData("Sheet1", 2, 3);
			   //step 2 : navigate to Campaign Page
			   homePage.navigateToCampaignPage();
			   //step 3 : navigate to create Campaign Page
			   allCampPage.navigateToCreateNewCampPage();
			   //step 4 : create new Campagin
			   createCampPage.createCampaign(compaignNAme,compaignType);
			   //step 5: verify camp in Campaign details PAge
			   String actComNAme = campDeatilsPAge.getComNAmedeatils().getText();
			   Assert.assertEquals(actComNAme, compaignNAme);
		}
		@Test
		public void searchCampWith()throws Throwable{
			String compaignNAme = eLib.getExcelData("Sheet1", 3, 2);
			   //step 2 : navigate to Campaign Page
			   homePage.navigateToCampaignPage();
			   //step 3 : search Camp
			   allCampPage.serchCampaign(compaignNAme);
		}
		
		@AfterMethod
		public void configAfterMtd(){
			comPage.logOut();
		}
		
		@AfterClass
		public void configAfterclass(){
			driver.close();
		}
	}

}
		