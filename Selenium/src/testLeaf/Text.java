package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/input.xhtml");
		
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Manoj S");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" Appending");
		boolean isEnable = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(isEnable);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		WebElement getvalue = driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println(getvalue.getAttribute("value"));
		WebElement pressTab = driver.findElement(By.id("j_idt88:j_idt99"));
		pressTab.sendKeys("Yes It is working..."+Keys.TAB);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am a good boy");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("man");
		driver.findElement(By.xpath("//*[@data-item-label='man3']")).click();
		
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("8/22/1998");
		driver.findElement(By.xpath("//*[text()='22']")).click();
		
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("22");
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[4]")).click();
		
		driver.findElement(By.id("j_idt106:slider")).sendKeys("75");
		
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		
		
		
		Thread.sleep(20000);
		driver.quit();
		
	}
}
