package Utills.screenshot;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseData1;

public class Screenshotfail extends BaseData1 {
	public void getscreenshot() throws IOException {
		Date currentdate= new Date();
		System.out.println(currentdate);
		String filename1=currentdate.toString().replace(" ", "-").replace(":","-");
		
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("src//test//resources//screenshot"+filename1+".png"));
	}
	

}
