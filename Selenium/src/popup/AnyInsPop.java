package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyInsPop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://tw-en.mytrip.com/rf/destination?text=12&from=MZG&domain=bing&domain=bing&campaign=non-brand-competitor-city&campaign=non-brand&msclkid=ce7d651c9ed5131f6d2c06992232bf83&utm_source=bing&utm_medium=cpc&utm_campaign=TW-EN-MZG%7CNon-Brand%7CDesktop%7CMytrip%7CSearch%7CCompetitor%7CBroad&utm_term=Make+Mytrip&utm_content=Make+Mytrip");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='etiIcon etiModal__closeIcon']")).click();
	}
}
