package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropType 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*FileInputStream fi=new FileInputStream("./TestData/Data.property");
		Properties proper=new Properties();
		proper.load(fi);
		String url = proper.getProperty("url");
		String un = proper.getProperty("un");
		String pw = proper.getProperty("pw");
		
		driver.get(url);
		driver.findElement(By.name("Email")).sendKeys(un);
		driver.findElement(By.name("Password")).sendKeys(pw);
		*/
		
		FileInputStream fi=new FileInputStream("./TestData/Data.property");
		Properties pro=new Properties();
		pro.load(fi);
		driver.get(pro.getProperty("url"));
		driver.findElement(By.name("Email")).sendKeys(pro.getProperty("un"));
		driver.findElement(By.name("Password")).sendKeys(pro.getProperty("pw"));
		
	}
}
