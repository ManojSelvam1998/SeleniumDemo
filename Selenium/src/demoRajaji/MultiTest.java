package demoRajaji;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultiTest extends Base 
{
	@Test
	public void test1()
	{
		driver.get("http://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("Manoj");
		driver.findElement(By.name("password")).sendKeys("Mano");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
	}
	@Test
	public void test2()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Manoj");
		driver.findElement(By.id("pass")).sendKeys("Mano");
		driver.findElement(By.name("login")).click();
		
	}
}
