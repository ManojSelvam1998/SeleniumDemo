package demoddt;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Ts extends Real implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		try {
			Tss(result.getMethod().getMethodName());
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
