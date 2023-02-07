package testNgg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2 
{
	/*@Test
	public void sam()
	{
		assertEquals(true, true);
	}
	@Test
	public void sam1()
	{
		assertNotEquals(0, 1);
	}
	@Test
	public void sam2()
	{
		assertTrue(true);
	}
	*/
	@Test
	public void mam()
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		String Title="Demo Web Shop";
		SoftAssert asserting=new SoftAssert();
		asserting.assertEquals("Demo Web Sho", Title);
		asserting.assertAll();
	}
	@Test
	public void mam1()
	{
		SoftAssert a1=new SoftAssert();
		a1.assertNotEquals(false, true);
	}
	@Test
	public void mam2()
	{
		SoftAssert a1=new SoftAssert();
		a1.assertTrue(true);
	}
	
}
