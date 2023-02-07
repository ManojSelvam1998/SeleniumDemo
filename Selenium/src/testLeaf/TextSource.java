package testLeaf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextSource 
{
	public TextSource(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="j_idt88:name") private WebElement text1;
	@FindBy(id="j_idt88:j_idt91") private WebElement append;
	@FindBy(id="j_idt88:j_idt93") private WebElement isdisabled;
	@FindBy(id="j_idt88:j_idt95") private WebElement clear;
	@FindBy(id="j_idt88:j_idt97") private WebElement getAttrib;
	@FindBy(id="j_idt88:j_idt99") private WebElement pressTabText;
	@FindBy(id="j_idt88:j_idt101") private WebElement text2;
	@FindBy(id="j_idt106:thisform:age") private WebElement enterKey;
	@FindBy(id="j_idt106:j_idt118_input") private WebElement spinvalue;
	@FindBy(xpath="(//*[@class='ui-button-text'])[3]") private WebElement spinIncre;
	@FindBy(xpath="(//*[@class='ui-button-text'])[4]") private WebElement spindecre;
	@FindBy(id="j_idt106:slider") private WebElement slider;
	public WebElement getText1() {
		return text1;
	}
	public WebElement getAppend() {
		return append;
	}
	public WebElement getIsdisabled() {
		return isdisabled;
	}
	public WebElement getClear() {
		return clear;
	}
	public WebElement getGetAttrib() {
		return getAttrib;
	}
	public WebElement getPressTabText() {
		return pressTabText;
	}
	public WebElement getText2() {
		return text2;
	}
	public WebElement getEnterKey() {
		return enterKey;
	}
	public WebElement getSpinvalue() {
		return spinvalue;
	}
	public WebElement getSpinIncre() {
		return spinIncre;
	}
	public WebElement getSpindecre() {
		return spindecre;
	}
	public WebElement getSlider() {
		return slider;
	}	
	
	
	
//	@FindBy() private WebElement ;	
}