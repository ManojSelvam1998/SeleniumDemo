package Basicpro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetMethods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.instagram.com/");
		a1.manage().window().maximize();
		a1.findElement(By.name("username")).sendKeys("8056552679");
		a1.findElement(By.name("password")).sendKeys("Manonkacg");
		a1.close();
	}

}
