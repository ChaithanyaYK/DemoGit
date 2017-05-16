package com.crm.pageObjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLib {

	
	@FindBy(linkText="Campaigns")
	private WebElement comaaignLnk;
	
	@FindBy(linkText="Leads")
	private WebElement leadsLnk;
	
	@FindBy(linkText="Accounts")
	private WebElement accountsLnk;
	
	public void navigateToCampaignPage(){
		comaaignLnk.click();
	}
	
	public void navigateToLeadPage(){
		leadsLnk.click();
	}
	public void navigateToAccountPage(){
		accountsLnk.click();
	}
	
	
}
