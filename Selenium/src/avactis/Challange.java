package avactis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challange 
{	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Ajith/OneDrive/Desktop/interviewQ.html");

		WebElement first = driver.findElement(By.id("multi1"));
		WebElement sec = driver.findElement(By.id("multi2"));
		WebElement third = driver.findElement(By.id("multi3"));
		
		Select sel1 = new Select(first);
		Select sel2 = new Select(sec);
		Select sel3 = new Select(third);
				
		List<WebElement> all1 = sel1.getOptions();
		List<WebElement> all2 = sel2.getOptions();
		List<WebElement> all3 = sel3.getOptions();
		Object[] arr1 = all1.toArray();
		Object[] arr2 = all2.toArray();
		Object[] arr3 = all3.toArray();
		int i,j,k;
		for (i=0;i<arr1.length;i++)
		{			
			
		}	
		for (WebElement f : all1) {
			
			  if(f.getText().equals("A")||f.getText().equals("E")) 
			  {
				  f.click();
				  System.out.println(f.getText()); 
			  }			 
		}		
		for (WebElement s : all2) {
			
			  if(s.getText().equals("G")||s.getText().equals("I")) 
			  { 
				  s.click();
				  System.out.println(s.getText()); 
			  }
		}
		for (WebElement t : all3) {
			
			  if(t.getText().equals("L")) 
			  { 
				  t.click(); 
				  System.out.println(t.getText()); 
			  }			
		}
	}


}
