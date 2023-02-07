package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Source 
{
	public Source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="small-searchterms") 
	private WebElement searchstore;
	
	
	public WebElement getSearchstore() {
		return searchstore;
	}
	
	@FindBy(xpath="//*[text()='Register']")
	private WebElement reglink;
	@FindBy(id="gender-male")
	private WebElement male;
	@FindBy(id="FirstName")
	private WebElement fsname;
	@FindBy (id="LastName")
	private WebElement lsname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(xpath="//*[@id='Password']")
	private WebElement pw;
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	private WebElement cpw;
	
	public WebElement getReglink() {
		return reglink;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getFsname() {
		return fsname;
	}
	public WebElement getLsname() {
		return lsname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPw() {
		return pw;
	}
	public WebElement getCpw() {
		return cpw;
	}
	
	
	
	
}
