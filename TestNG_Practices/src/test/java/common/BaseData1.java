package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseData1 {
	
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void browserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	@AfterSuite
	public void teardown() {
		driver.close();
	}

}
