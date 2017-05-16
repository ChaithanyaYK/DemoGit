package com.crm.CampaignTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.GenericLib.Browser;
import com.crm.GenericLib.Constant;
import com.crm.pageObjectrepositorylib.PpkrLogIn;

public class ExPPkrlgn {
	Logger log=Logger.getLogger(ExPPkrlgn.class);
	PpkrLogIn lgn;
	 WebDriver driver;
  @Test
  public void f() {
	driver=Browser.getBrowser();
	//driver.findElement(By.xpath("http://192.168.80.128:8080/crm/HomePage.do"));
	log.info("lgn=PageFactory.initElements(driver, PpkrLogIn.class)");
	lgn.user_Name();
	  
  }
  
}
