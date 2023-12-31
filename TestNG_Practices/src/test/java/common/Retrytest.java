package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Retrytest implements IRetryAnalyzer{
	
	private int retryCount=0;
	private static final int maxRetryCount=4;
	
	public boolean retry(ITestResult result) {
		if(retryCount<maxRetryCount) {
			retryCount++;
			
			return true;
		}
		return false;
	}

}
