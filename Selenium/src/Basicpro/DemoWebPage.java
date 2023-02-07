package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Manoj");
		driver.findElement(By.cssSelector("input[id=\'LastName\']")).sendKeys("S");
		driver.findElement(By.name("Email")).sendKeys("smanoj22898@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Manoj@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Manoj@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("smanoj22898@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Manoj@123");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
	