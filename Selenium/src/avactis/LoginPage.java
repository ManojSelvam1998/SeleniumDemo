package avactis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basicpro.InstaPass;

public class LoginPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try 
		{
		driver.get("http://localhost/avactis-system/admin/signin.php");
		}
		catch(Exception a1)
		{
			System.out.println("Plz Turn On WampServer");
			driver.quit();
		}
		Thread.sleep(1000);
		WebElement userid = driver.findElement(By.xpath("(//*[@name='AdminEmail'])[1]"));
		userid.sendKeys("smanoj22898@gamil.com");
		if(userid.getAttribute("value").equals("smanoj22898@gamil.com"))
		{
			System.out.println("Test 1 pass");
		}
		WebElement password = driver.findElement(By.xpath("(//*[@name='Password'])[1]"));
		password.sendKeys(InstaPass.s3);
		if(password.getAttribute("value").equals(InstaPass.s3))
		{
			System.out.println("Test 2 pass");
		}
		driver.findElement(By.xpath("(//*[@name='RememberEmail'])[1]")).click();
		System.out.println("TagName "+userid.getTagName());
		driver.findElement(By.xpath("//*[@id='SignInButton1']")).click();
		LoginPage a1=new LoginPage();
		Thread.sleep(2000);
		a1.catalog(driver);
		Thread.sleep(2000);
		a1.mandriver(driver);
		
		
		
		driver.quit();
	}
	
	public void catalog(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[text()='Catalog'])[1]")).click();		
	}
	
	public void mandriver(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Manage Products']")).click();
		Thread.sleep(2000);
		WebElement cat=driver.findElement(By.name("category_ids"));
		Select select0=new Select(cat);
		select0.selectByValue("9");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[text()='Add Product'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='Name']")).sendKeys("Yuvan List");
		
		WebElement ptype=driver.findElement(By.xpath("//*[@name='SelectTypeID']"));
		Select select=new Select(ptype);
		select.selectByVisibleText("Music");
		
		driver.findElement(By.name("SalePrice")).sendKeys("2500");
		driver.findElement(By.name("ListPrice")).sendKeys("3540");
		driver.findElement(By.name("QuantityInStock")).sendKeys("50");
		driver.findElement(By.name("LowStockLevel")).sendKeys("0");
		driver.findElement(By.name("MinQuantity")).sendKeys("0");
		
		WebElement pstatus=driver.findElement(By.name("Available"));
		Select select1=new Select(pstatus);
		select1.selectByValue("4");
		
		WebElement pTax=driver.findElement(By.name("TaxClass"));
		Select select2=new Select(pTax);
		select2.selectByValue("1");
		
		WebElement pman=driver.findElement(By.name("Manufacturer"));
		Select select3=new Select(pman);
		select3.selectByValue("5");
	
	
	}
	
	
	
	
}
