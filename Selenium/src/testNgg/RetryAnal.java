package testNgg;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryAnal 
{
	@Test(retryAnalyzer = analizer.RetryAnalyzer.class)
	public void m1()
	{
		Assert.assertEquals(false, true);
	}
	@Test(retryAnalyzer = analizer.RetryAnalyzer.class)
	public void m2()
	{
		Assert.assertEquals(true, true);
	}
}
