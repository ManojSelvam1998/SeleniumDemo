package lao.interviewqus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLReadandWrite 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{	
		FileInputStream fis=new FileInputStream("./TestData/D.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		/*
		 * DataFormatter df=new DataFormatter();
		 * df.formatCellValue(wb.getSheet("Sheet1").getRow(4).getCell(0));
		 */
		wb.getSheet("Sheet1").getRow(4).createCell(1).setCellValue("NewCellValue");
		
		FileOutputStream fos=new FileOutputStream("./TestData/D.xlsx");
		wb.write(fos);
		
	}
}
