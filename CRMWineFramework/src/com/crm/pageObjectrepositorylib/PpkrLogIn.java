package com.crm.pageObjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.GenericLib.Constant;

public class PpkrLogIn 
{
	@FindBy(id="userName")
	private WebElement UserName;
	
	@FindBy(id="passWord")
	private WebElement PassWord;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signinBtn;
	
	
	
	public void user_Name()
	{
		
		UserName.sendKeys(Constant.userName);
		PassWord.sendKeys(Constant.passwrd);
		signinBtn.click();
		
	}

}
