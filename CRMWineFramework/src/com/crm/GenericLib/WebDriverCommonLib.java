package com.crm.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
 public void waitforPageLoad()
 {
	 Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 public void waitforElementPresent(WebElement wb)
 {
	 WebDriverWait wait=new WebDriverWait(Browser.driver,20);
	 wait.until(ExpectedConditions.visibilityOf(wb));
 }
 public void type(WebElement editwb, String data)
 {
	 waitforElementPresent(editwb);
 }
 public void click(WebElement clickwb)
 {
	 waitforElementPresent(clickwb);
	 clickwb.click();
 }
 public void select(WebElement selectwb, String data)
 {
	 Select sel= new Select(selectwb);
	 sel.selectByVisibleText(data);
 }
 public void select(WebElement selectwb, int index)
 {
	 Select sel= new Select(selectwb);
	 sel.selectByIndex(index);
 }
 
}
