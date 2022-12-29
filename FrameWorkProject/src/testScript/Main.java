package testScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.DDT;
import generic.GenericClass;
import generic.TKScreen;
import pom.Pom;
@Listeners(TKScreen.class)
public class Main extends GenericClass
{
	@Test
	public void test1()
	{
																				//System.out.println(DDT.un);  System.out.println(DDT.pwd);
		Pom p=new Pom(driver);													//p.getUsername().clear();
		p.getUsername().sendKeys(DDT.excel(0, 0));  							//p.getPassword().clear();
		p.getPassword().sendKeys(DDT.excel(0, 1));
		p.getLoginbtn().click();
		Assert.fail();
		
	}
	@Test
	public void test2()
	{
																				//System.out.println(DDT.un);  System.out.println(DDT.pwd);
		Pom p=new Pom(driver);													p.getUsername().clear();
		p.getUsername().sendKeys(DDT.excel(1, 0));  							p.getPassword().clear();
		p.getPassword().sendKeys(DDT.excel(1, 1));
		p.getLoginbtn().click();
		Assert.fail();
		
	}
}
