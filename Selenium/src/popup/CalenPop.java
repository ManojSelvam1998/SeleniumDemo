package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenPop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tripodeal.com/hotels");
		WebElement element = driver.findElement(By.xpath("//*[@id='tpcwl_iframe']"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("hotels-dates-checkin-prepop-whitelabel_en")).click();
		driver.findElement(By.id("mewtwo-datepicker-2022-12-5")).click();


	}
}
