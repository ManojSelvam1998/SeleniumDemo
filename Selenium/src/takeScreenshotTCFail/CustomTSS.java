package takeScreenshotTCFail;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTSS extends Base implements ITestListener
{
	 public void onTestFailure(ITestResult result) 
	 {
		 System.out.println("TestCase Failed");
		 try 
		{
			takeSS(result.getMethod().getMethodName());
		} catch (WebDriverException | IOException e) 
		{
			e.printStackTrace();
		}
	 }
}
