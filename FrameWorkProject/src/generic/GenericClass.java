package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GenericClass implements BrowserChoice
{
	public static WebDriver driver;
	@BeforeClass
	public void open()
	{
		System.setProperty(ek,ev);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}
