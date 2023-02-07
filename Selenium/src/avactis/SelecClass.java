package avactis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ajith/OneDrive/Desktop/SelectClass.html");
		
		WebElement sin = driver.findElement(By.id("single"));
		Select select=new Select(sin);
		System.out.println(select.isMultiple());
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		select.selectByValue("2");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Manual");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = select.getOptions();
		//System.out.println(allOptions.get(2).getText());--> for single text..
		for(WebElement element:allOptions)
		{
			System.out.println(element.getText());//--> for multiple text..
		}
		
		WebElement mul=driver.findElement(By.id("multiple"));
		Select select1=new Select(mul);
		System.out.println(select.isMultiple());
		
		select1.selectByValue("1");
		select1.selectByValue("2");
		select1.selectByValue("3");
		select1.selectByValue("4");
		Thread.sleep(2000);
		
		select1.deselectByIndex(0);
		Thread.sleep(2000);
		
		select1.deselectByIndex(1);
		Thread.sleep(2000);
		
		select1.deselectByValue("3");
		Thread.sleep(2000);
		
		select1.deselectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		select1.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement firstoption = select1.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		Thread.sleep(2000);
		
		List<WebElement> getallsel = select1.getAllSelectedOptions();
		for(WebElement element:getallsel)
		{
			System.out.println(element.getText());
		}
		
		Thread.sleep(2000);
		
		select1.deselectAll();
		Thread.sleep(3000);	
		
		driver.quit();
		
	}
}
