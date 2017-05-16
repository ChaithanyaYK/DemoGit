package com.crm.ContactTest;
import java.awt.PageAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pageObjectrepositorylib.AllCompaigns;
import com.crm.pageObjectrepositorylib.CampaignDetails;
import com.crm.pageObjectrepositorylib.Comman;
import com.crm.pageObjectrepositorylib.CreateCampaign;
import com.crm.pageObjectrepositorylib.HomePageLib;
import com.crm.pageObjectrepositorylib.LoginPageLib;
import com.crm.GenericLib.Browser;
import com.crm.GenericLib.ExcelLib;


public class ContactTest {
	
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
		//object intialization
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
	public void createContactTest() throws Throwable{
           System.out.println("execute createContactTest");
	}
	
	@Test
	public void mofdifyContactTest()throws Throwable{
        System.out.println("execute mofdifyContactTest");
	}
	@Test
	public void searchConatctWith()throws Throwable{
        System.out.println("execute searchConatctWith");
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

