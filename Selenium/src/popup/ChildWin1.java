package popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWin1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//*[text()='Open Multiple")).click();
		Set<String> sub = driver.getWindowHandles();
		
		Iterator<String> it = sub.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
