package main.utilities.properties;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/*
 * @Description
 * For generic Utilities of TestCases
 * 
 */

public class TestUtil {
	
	/*
	 * @Description
	 * GetScreenshot for validations
	 */

	public static String getScreenshot(WebDriver driver){
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination = new File(path);
		
		try{
			FileUtils.copyFile(source, destination);
		}catch(IOException e){
			System.out.println("Capture Failed " +e.getMessage());
			
		}
		
		return path;
		
		
		
	}
	
	
}
