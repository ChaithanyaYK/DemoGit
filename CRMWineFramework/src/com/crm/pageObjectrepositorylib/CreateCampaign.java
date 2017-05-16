package com.crm.pageObjectrepositorylib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.crm.GenericLib.WebDriverCommonLib;

public class CreateCampaign extends WebDriverCommonLib{

	
	@FindBy(name="property(Campaign Name)")
	private WebElement campNAmeEdt;
	
	@FindBy(name="property(Type)")
	private WebElement campTypedd;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement saveBtn;
	
	
	public void createCampaign(String campaignNAme){
		campNAmeEdt.sendKeys(campaignNAme);
		saveBtn.click();
	}
	public void createCampaign(String campaignNAme , String campType){
		campNAmeEdt.sendKeys(campaignNAme);
		select(campTypedd, campType);
		saveBtn.click();
	}
	
}

