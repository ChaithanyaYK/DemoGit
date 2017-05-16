package com.crm.pageObjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.GenericLib.WebDriverCommonLib;

public class AllCompaigns extends WebDriverCommonLib{

	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampBtn;
	
	@FindBy(name="searchString")
	private WebElement searchCampEdit;
	
	@FindBy(xpath="//input[@class='textField']/following-sibling::input")
	private WebElement compGobtn;
	
	public void navigateToCreateNewCampPage(){
		waitforElementPresent(newCampBtn);
		newCampBtn.click();
		
	}
	
	public void serchCampaign(String campNAme){
		searchCampEdit.sendKeys(campNAme);
		compGobtn.click();
	}
	
}

