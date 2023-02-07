package takeScreenshotTCFail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomTSS.class)
public class TestClass extends Base
{
	@BeforeMethod
	public void before()
	{
		befMeth();
	}
	@Test
	public void google()
	{
		Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void after() throws InterruptedException
	{
		aftMeth();
	}
	
	
}
