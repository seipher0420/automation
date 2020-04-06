
package main.java.com.metrobank.automation.testcase;

import java.io.IOException;
import java.util.logging.FileHandler;

import main.java.com.metrobank.automation.core.utilities.filehandler.FileHandle;

public class TestClass {

	public static void main(String[] args) throws IOException{
		FileHandle file = new FileHandle();
		
		String test = file.readPdfFile("E:\\test.pdf");
		System.out.println(test);
		
		
	}
	
	
}
