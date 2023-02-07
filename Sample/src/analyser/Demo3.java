package analyser;

import org.testng.Assert;
import org.testng.annotations.*;

public class Demo3 
{
	@Test(retryAnalyzer = RetryClass.class)
	public void test()
	{
		Assert.assertEquals(true, false);
	}
}
