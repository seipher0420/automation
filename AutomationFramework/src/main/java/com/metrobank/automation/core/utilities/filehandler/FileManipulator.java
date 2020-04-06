package main.java.com.metrobank.automation.core.utilities.filehandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

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
		StringBuilder text =  new StringBuilder();
		try (PDDocument document = PDDocument.load(new File(filePath))) {
			document.getClass();
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				String pdfFileInText = tStripper.getText(document);
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					text.append(line);
				}
			}
		}
		return text.toString();
	}
	

	
	
	
}
