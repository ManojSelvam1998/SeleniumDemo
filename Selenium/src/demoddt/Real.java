package demoddt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Ts.class)
public class Real
{
	static WebDriver driver;
	@BeforeClass
	public void BT()
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
	}
	
	@Test
	public void Tes1()
	{
		BasePom bp=new BasePom(driver);
		bp.getMalebutton().click();
		bp.getFirstname().sendKeys("M");
		bp.getLastname().sendKeys("S");
		Assert.assertEquals(false, true);
		bp.getEmail().sendKeys("sma");
		bp.getPass().sendKeys("man");
		bp.getPass1().sendKeys("man");		
		
	}
	
	@AfterClass
	public void AT() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	//TakeScreenShot Method
	public static void Tss(String filename) throws WebDriverException, IOException
	{
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\SS\\"+filename+".png"));

	}

}
