package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//*[text()='Men'])[1]"));
		act.moveToElement(men).perform();//-->WebElement..
		act.moveToElement(men, 148,41).perform();,//-->ByOffSet	                          //not working..
		act.moveToElement(men).click().perform();//-->click().
		act.click(men).perform();//-->click(WE).
		WebElement doubclic = driver.findElement(By.xpath("//*[text()='Profile']"));
		act.moveToElement(doubclic).doubleClick().perform();//-->doubleClick().
		act.doubleClick(doubclic).perform();//-->doubleClick(WE)..
		*/
		/*driver.get("https://www.instagram.com/");
		Actions actt=new Actions(driver);
		WebElement contclic = driver.findElement(By.xpath("//*[@name='username']"));
		//actt.contextClick().perform();
		//actt.contextClick(contclic).perform();
		//actt.sendKeys(contclic, "Hi users").perform();
		//actt.moveToElement(contclic).sendKeys("Hi users").perform();                     //not working..
		*/
		/*driver.get("https://www.google.com/");
		Actions act1=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//*[text()='Advertising']"));
		WebElement dest = driver.findElement(By.xpath("//*[@name='q']"));
		act1.dragAndDrop(src, dest);
		*/
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		
		
		Thread.sleep(3000);
		
	}
}
