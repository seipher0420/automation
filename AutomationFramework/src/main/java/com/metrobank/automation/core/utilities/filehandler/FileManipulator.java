package main.java.com.metrobank.automation.core.utilities.filehandler;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import main.java.com.metrobank.automation.generics.AutomationConstants;

public class FileManipulator {

	public boolean checkDownloadFile(String filePath){
		boolean isExisting = false;
		
		
		File file = new File(filePath);
		
		if(file.exists()){
			isExisting = true;
			System.out.println(AutomationConstants.FRAMEWORK_LOGS + filePath + "is Existing");
		}
			System.out.println(AutomationConstants.FRAMEWORK_LOGS + "file doesn't Exist");
			return isExisting;
	}
	
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
		PDDocument pdfFile = null;
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		if(file.exists()){
			 pdfFile = PDDocument.load(file);
			 if(!pdfFile.isEncrypted()){
					text = pdfStripper.getText(pdfFile);
					System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Successfully Read PDF File.");
				}
		}else{
			System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Failed to read PDF File not Found.");
		}
		
		pdfFile.close();
		return text;	
	}
	

	
	
	
}
