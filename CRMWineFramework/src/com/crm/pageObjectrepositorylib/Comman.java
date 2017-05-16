package com.crm.pageObjectrepositorylib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Comman {
	
	@FindBy(xpath="//a[contains(text(),'Logout ')]")
	private WebElement logoutLink;
	
	
	public void logOut(){
		logoutLink.click();
	}

}

