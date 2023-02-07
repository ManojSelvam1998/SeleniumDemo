package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSele 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys(InstaPass.s1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(InstaPass.s2);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//a[@href=\'/direct/inbox/\']")).click();
		driver.findElement(By.xpath("//div[@class='_aaav']")).click();
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//div[text()='Profile']")).click();
		driver.findElement(By.xpath("//*[@class=\'_abl-\']")).click();
		//driver.findElement(By.xpath("//div[@class='_aaav']")).click();
		//driver.findElement(By.xpath("//div[text()='Log Out']")).click();
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
