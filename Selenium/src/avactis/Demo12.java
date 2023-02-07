package avactis;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//*[text()='Select PDF file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("./Selenium Sw/scr4.exe");
		
	}
}
