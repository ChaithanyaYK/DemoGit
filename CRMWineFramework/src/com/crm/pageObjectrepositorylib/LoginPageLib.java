package com.crm.pageObjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.GenericLib.Browser;
import com.crm.GenericLib.Constant;
import com.crm.GenericLib.WebDriverCommonLib;

public class LoginPageLib extends WebDriverCommonLib {
	@FindBy(id="userName")
	private WebElement userNameEdt;
	
	@FindBy(id="passWord")
	private WebElement passworEdt;
	
	@FindBy(xpath="//input[@type='image']")
	private WebElement loginbtn;

	public void loginToCrm()
	{
		Browser.driver.get(Constant.url);
		waitforPageLoad();
		userNameEdt.sendKeys(Constant.userName);
		passworEdt.sendKeys(Constant.passwrd);
		loginbtn.click();
	}
}
