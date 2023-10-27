package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utills.screenshot.Screenshotfail;



public class Listeners extends Screenshotfail implements ITestListener {
	
public void OnTestStart(ITestResult result) {
	Reporter.log("the name of the method is  "+result.getName());
	System.out.println("test case starting");
}
public void OntestSuccess(ITestResult result) {
	Reporter.log("status of result--"+result.getStatus());
	System.out.println("send an email to teams suceess ");
}
public void onTestFailure(ITestResult result) {
	try {
		getscreenshot();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
 
}
private void Screenshotfail() {
	// TODO Auto-generated method stub
	
}
public void ontTestskipped(ITestResult result) {
	
}
public void onTestFailedWithinSuccesPercentage(ITestResult result) {
	
}
public void onTestFinished(ITestResult result) {
	
}
}
