package testScript;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report 
{
	public static void main(String[] args) 
	{
		ExtentReports report=new ExtentReports("./ScreenShot/report.html");
		ExtentTest test = report.startTest("TC1");
		
		test.log(LogStatus.PASS, "PASS");
		test.log(LogStatus.FAIL, "FAIL");
		test.log(LogStatus.SKIP, "SKIP");
		
		report.endTest(test);
		report.flush();
	}
}
