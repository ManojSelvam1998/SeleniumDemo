package Basicpro;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		org.openqa.selenium.Dimension a=new org.openqa.selenium.Dimension(200,400);
		driver.manage().window().setSize(a);
		Point b=new Point(200, 300);
		driver.manage().window().setPosition(b);
	}

}
