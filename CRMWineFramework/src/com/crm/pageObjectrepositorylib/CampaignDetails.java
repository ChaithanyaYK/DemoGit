package com.crm.pageObjectrepositorylib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignDetails {

	
	@FindBy(id="value_Campaign Name")
	private WebElement comNAmedeatils;

	public WebElement getComNAmedeatils() {
		return comNAmedeatils;
	}
	
	
}
