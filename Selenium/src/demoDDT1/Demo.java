package demoDDT1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/login");
	
	File fi=new File("./TestData/Demo123.xlsx");
	Workbook wb=WorkbookFactory.create(fi);
	
	Sheet sheet = wb.getSheet("Sheet1");
	int nrow=sheet.getLastRowNum();      //System.out.println(sheet.getLastRowNum());
	Row r=sheet.getRow(0);
	int ncell=r.getLastCellNum();        //System.out.println(r.getLastCellNum());
	
	ArrayList<Cell> a=new ArrayList<Cell>();
	for(int i=1;i<=nrow;i++)
	{	
		for(int j=0;j<ncell;j++)
		{
			//System.out.println(sheet.getRow(i).getCell(j));
			a.add(sheet.getRow(i).getCell(j));
			String s=sheet.getRow(i).getCell(j).toString();
			driver.findElement(By.id("Email")).sendKeys(s);
		}
		//driver.findElement(By.id("Password")).sendKeys();
	}
	System.out.println(a);
	
	
	
	
	driver.quit();
	}
}
