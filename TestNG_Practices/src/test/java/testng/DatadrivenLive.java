package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.DataProviderCommon;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenLive{
	
	@Parameters({"browser"})
	@Test(dataProvider = "data1",dataProviderClass=DataProviderCommon.class)
	public void datadriven(String username, String password, String browser) {
		WebDriver driver=null;
		if(browser.equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		
		  
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
}
