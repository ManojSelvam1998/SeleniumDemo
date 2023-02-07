package pomm;

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
	@FindBy(id="gender-male")private WebElement maleGender;

	public WebElement getMaleGender() {
		return maleGender;
	}
	@FindBy(id="FirstName")private WebElement firstname;
	

	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(id="LastName")private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
}
