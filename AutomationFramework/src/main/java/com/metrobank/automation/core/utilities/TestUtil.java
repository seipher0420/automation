package main.java.com.metrobank.automation.core.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.com.metrobank.automation.generics.AutomationConstants;

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
	 * @Description GetScreenshot for validations
	 */

	public static String getScreenshot(WebDriver driver) {
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		String screenshotBase64;
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshot/"
				+ System.currentTimeMillis() + ".png";
		screenshotBase64 = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.BASE64);
		File destination = new File(path);

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());

		}

		return screenshotBase64;
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

	public String getWindowsHandle(WebDriver driver) {

		return driver.getWindowHandle();

	}

	public void switchToNewWindow(WebDriver driver) {
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();

			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow)
						.getTitle());
				driver.close();
			}
		}

		driver.switchTo().window(mainWindow);
	}

	// Wait time 1-5 seconds
	public static void waitTime(int seconds) throws InterruptedException {
		switch (seconds) {
		case 1:
			Thread.sleep(1000);
			break;

		case 2:
			Thread.sleep(2000);
			break;

		case 3:
			Thread.sleep(3000);
			break;

		case 4:
			Thread.sleep(4000);
			break;

		case 5:
			Thread.sleep(5000);
			break;
		default:
			Thread.sleep(1000);
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Default set to 1 second");
		}
	}

	public static String createNewFolderBaseDate() {
		Format format = new SimpleDateFormat("MMddyy");
		String strDate = format.format(new Date());
		String userDirectory = System
				.getProperty(AutomationConstants.USER_DIRECTORY);
		String path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER
				+ "/" + strDate + "/";

		File file = new File(path);
		boolean createDir = file.mkdir();
		if (createDir) {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has been Created " + path);
		} else {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has already been created or not found " + path);
		}
		return path;
	}

	public static String createResultFolder(String result) {
		Format format = new SimpleDateFormat("MMddyy");
		String strDate = format.format(new Date());
		String userDirectory = System
				.getProperty(AutomationConstants.USER_DIRECTORY);
		String path;

		switch (result) {
		case "pass":
			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/"
					+ strDate + "/PASS/";
			break;
		case "fail":
			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/"
					+ strDate + "/FAIL/";
			break;
		case "tempFolder":
			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/"
					+ strDate + "/TempFolder/";
			break;
		default:
			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/"
					+ strDate + "/";
			break;
		}

		File file = new File(path);
		boolean createDir = file.mkdir();
		if (createDir) {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has been Created " + path);
		} else {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has already been created or not found " + path);
		}
		return path;
	}

}
		
	
	
	
	

