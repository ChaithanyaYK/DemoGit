package com.crm.GenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class SampleListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
String testname = result.getMethod().getMethodName();
EventFiringWebDriver eDriver= new EventFiringWebDriver(Browser.driver);
File srcfile= eDriver.getScreenshotAs(OutputType.FILE);

try
{
	FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"//Screenshot//"+testname+".png"));
	
} 
catch (IOException e)
{
	e.printStackTrace();
}
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
		
	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

}
