package Basicpro;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		//driver.navigate().to("https://www.flipkart.com/");
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		driver.navigate().back();
		driver.navigate().forward();
	}

}
