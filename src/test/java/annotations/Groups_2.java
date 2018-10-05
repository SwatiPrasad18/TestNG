package annotations;

import org.testng.annotations.Test;

public class Groups_2{
	@Test(groups = {"functional"})
	public void testMethod1()
	{
		System.out.println("testMethod1");
	}
	
	@Test(groups = {"functional","smoke"})
	public void tetsMethod2()
	{
		System.out.println("testMethod2");
	}
	
	@Test(groups= {"smoke"})
	public void testMethod3()
	{
		System.out.println("testMethod3");
	}
	
	@Test(groups= {"smoke"})
	public void testMethod4()
	{
		System.out.println("testMethod4");
	}
	
	
}
