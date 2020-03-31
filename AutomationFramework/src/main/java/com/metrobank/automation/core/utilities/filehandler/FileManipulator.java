package main.java.com.metrobank.automation.core.utilities.filehandler;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import main.java.com.metrobank.automation.generics.AutomationConstants;

public class FileManipulator {

	public void deleteFile(String filePath) {

		File file = new File(filePath);

		if (file.delete()) {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "File has been deleted");
		} else {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "File has not been deleted/Cannot be found");
		}

	}
	
	public String readPdfFile(String filePath) throws IOException{
		File file = new File(filePath);
		String text = null;
		
		PDDocument pdfFile = PDDocument.load(file);
		
		if(!pdfFile.isEncrypted()){
			PDFTextStripper pdfStripper = new PDFTextStripper();
			text = pdfStripper.getText(pdfFile);
		}
		pdfFile.close();
		return text;	
	}
	
	
	
	
}
