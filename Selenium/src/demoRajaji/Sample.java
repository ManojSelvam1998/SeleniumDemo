package demoRajaji;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample extends Base
{
	@Test
	public void test()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Manoj");
		driver.findElement(By.id("pass")).sendKeys("Mano");
		driver.findElement(By.name("login")).click();
		
	}
}
