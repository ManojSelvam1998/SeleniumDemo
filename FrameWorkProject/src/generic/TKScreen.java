package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TKScreen extends GenericClass implements ITestListener
{
	
	public void onTestFailure(ITestResult result) 
	{
		try {
			Thread.sleep(2000);
			tss(result.getMethod().getMethodName());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void tss(String name) throws IOException
	{
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File fi=new File("C:\\Users\\Ajith\\eclipse-workspace\\Instagram\\ScreenShot\\"+name+" "+d2+".png");
		FileUtils.copyFile(scr, fi);
		
	}
}
