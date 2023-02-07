package girishbro;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class ChildBrpop 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		driver.findElement(By.name("//*[@name='PushButton']")).click();
		Set<String> total = driver.getWindowHandles(); 
		for (String id : total) 
		{
			System.out.println(id.toString());
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		driver.quit();
	}
}
