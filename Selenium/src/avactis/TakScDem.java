package avactis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakScDem 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Selenium Sw/marlinSis.png"));
		
		WebElement ts = driver.findElement(By.xpath("//a[text()='Register']"));
		File photo = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./Selenium Sw/marlinSis.png");
		FileUtils.copyFile(photo, file);
		
		
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./Selenium Sw/marlinSis.png");
		FileUtils.copyFile(photo, file);    
		*/
	
	
	
	
	}
	
	
	
	
	
}
