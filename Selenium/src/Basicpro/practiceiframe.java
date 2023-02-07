package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceiframe 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./selenium Sw/chromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.tripodeal.com/hotels");
Thread.sleep(2000);
WebElement element = driver.findElement(By.xpath("//*[@id='tpcwl_iframe']"));
driver.switchTo().frame(element);
driver.findElement(By.name("destination")).sendKeys("Banglore");

}
}
