package testNgg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnnoTrasf 
{
	@Test
	public void m1()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void m2()
	{
		Assert.assertEquals(true, true);
	}
}
