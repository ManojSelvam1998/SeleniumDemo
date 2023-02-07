package pomm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		Source sc=new Source(driver);
		sc.getMaleGender().click();
		sc.getFirstname().sendKeys("Man");
		sc.getLastname().sendKeys("S");
		
	}
}
