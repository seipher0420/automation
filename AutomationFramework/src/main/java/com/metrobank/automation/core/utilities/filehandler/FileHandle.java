package main.java.com.metrobank.automation.core.utilities.filehandler;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import main.java.com.metrobank.automation.generics.AutomationConstants;

public class FileHandle {

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
	
	public String[] readPdfFile(String filePath) throws IOException{
		StringBuilder text =  new StringBuilder();
		String pathImage = null;
		Format format = new SimpleDateFormat("MMddyy");
		String strDate = format.format(new Date());
		String pdfFileImage = System
				.getProperty(AutomationConstants.USER_DIRECTORY)
				+ AutomationConstants.TEST_REPORT_FOLDER
				+ "/" + strDate
				+ AutomationConstants.TEST_REPOR_PDF_IMAGES;
		
		File pdfFileFolder = new File(pdfFileImage);
		boolean createDir = pdfFileFolder.mkdir();
		if (createDir) {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has been Created " + pdfFileImage);
		} else {
			System.out.println(AutomationConstants.FRAMEWORK_LOGS
					+ "Folder has already been created or not found " + pdfFileImage);
		}
		
		try (PDDocument document = PDDocument.load(new File(filePath))) {
			document.getClass();
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				PDPageTree list = document.getPages();
				String pdfFileInText = tStripper.getText(document);
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					text.append(line);
				}

				for (PDPage page : list) {
					PDResources pdResources = page.getResources();
					for (COSName cosName : pdResources.getXObjectNames()) {
						PDXObject pdxObject = pdResources.getXObject(cosName);
						if (pdxObject instanceof PDImageXObject) {
							pathImage = pdfFileImage + System.nanoTime() + ".png";
							File file = new File(pathImage);
							ImageIO.write(((PDImageXObject) pdxObject).getImage(), "png", file);
						}
					}
				}

			}
		}
		return new String[] {text.toString(), pathImage};
	}
	

	
	
	
}
