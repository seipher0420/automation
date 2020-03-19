package main.utilities.Helpers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

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
	
	public static boolean isEmptyOrWhitespace(String value) {
	    value = makeSafe(value);
	    for (int i = 0, n = value.length(); i < n; i++) {
	      if (!Character.isWhitespace(value.charAt(i))) {
	        return false;
	      }
	    }
	    return true;
	  }
	
	public static String makeSafe(String value) {
	    return (value == null) ? "" : value;
	  }
	
	public String getWindowsHandle(WebDriver driver){

		return driver.getWindowHandle();
	
	}
	
	public void switchToNewWindow(WebDriver driver){
		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
		String childWindow=itr.next();

		if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();
		}
		}

		driver.switchTo().window(mainWindow);
	}
	

	
	
	
	
	
}
