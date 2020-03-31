
package main.java.com.metrobank.automation.testcase;

import java.io.IOException;
import java.util.logging.FileHandler;

import main.java.com.metrobank.automation.core.utilities.filehandler.FileManipulator;

public class TestClass {

	public static void main(String[] args) throws IOException{
		FileManipulator file = new FileManipulator();
		
		String test = file.readPdfFile("E:\\test.pdf");
		System.out.println(test);
		
		
	}
	
	
}
