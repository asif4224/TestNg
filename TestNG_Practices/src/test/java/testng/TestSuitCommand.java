package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuitCommand {
@Test	
public void AsssertUse() {
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	
	SoftAssert softassertion=new SoftAssert();
	
	String expectedtitle="Arco | Experts in Safety and the UK's leading supplier of safety equipment, workwear, safety boots and shoes, gloves and maintenance supplies";
	driver.get("https://www.arco.co.uk/");
	String actualTitle=driver.getTitle();
	
	
	softassertion.assertEquals(actualTitle, expectedtitle,"page title");
	
	String Actualattribute=driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[2]/nav/ul/li[8]/a")).getAttribute("title");
	String Expectedattribut="About Arco";
	softassertion.assertEquals(Actualattribute, Expectedattribut,"Attribute validation");
	String ExpectedAttribut="";
	
	softassertion.assertAll();
	
	//Assert.assertEquals(actualTitle, expectedtitle);
	
	
	
	driver.close();
	
}

}
