package main.java.Constants;

import java.io.IOException;

import main.java.Abstract.mainConnection;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoadConnection extends mainConnection{

	WebDriver driver;
	
	@Test
	public void testConnection() throws IOException, InterruptedException{
		
		
		driver = connection("internetexplorer");
		Thread.sleep(10000);
		driver.close();
		
	}
	
	
}
