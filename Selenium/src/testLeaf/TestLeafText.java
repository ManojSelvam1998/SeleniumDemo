package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafText 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/input.xhtml");
		
		TextSource ts=new TextSource(driver);
		ts.getText1().sendKeys("Manoj");
		ts.getAppend().sendKeys("Appending");
		System.out.println(ts.getIsdisabled().isEnabled());
		ts.getClear().clear();
		System.out.println(ts.getGetAttrib().getAttribute("value"));
		ts.getPressTabText().sendKeys("something"+Keys.TAB);
		ts.getText2().sendKeys("something....");
		ts.getEnterKey().sendKeys(Keys.ENTER);
		ts.getSpinvalue().sendKeys("22");
		ts.getSpinIncre().click();
		ts.getSpindecre().click();
		ts.getSlider().sendKeys("75");
	}
}
