package demoddt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class BasePom
{
	public BasePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	private WebElement malebutton;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	private WebElement pass1;

	public WebElement getMalebutton() {
		return malebutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getPass1() {
		return pass1;
	}
	
	
	public void dataGen() throws InvalidFormatException, IOException
	{
		File fi=new File("\"C:\\Users\\Ajith\\OneDrive\\Desktop\\OrangeHRM.xlsx\"");
		Workbook wb= WorkbookFactory.create(fi);
		System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1));
		
		
	}
	
}
