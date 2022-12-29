package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import testScript.Main;

public class DDT extends Main
{
	public static String excel(int r,int c)
	{
		String value = null;
		try {
			FileInputStream fis=new FileInputStream("./ExcelFile/Data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			value=wb.getSheet("Sheet1").getRow(r).getCell(c).toString();
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} return value;
	}
	
	
}
