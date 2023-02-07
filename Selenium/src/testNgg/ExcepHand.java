package testNgg;

import org.testng.annotations.Test;

public class ExcepHand 
{
	@Test(expectedExceptions = ArithmeticException.class)
	public void m1()
	{
		int a=10, b=0;
		int c=a/b;
		System.out.println(c);
	}
}
