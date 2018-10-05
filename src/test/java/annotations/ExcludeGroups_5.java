package annotations;

import org.testng.annotations.Test;

public class ExcludeGroups_5 {

	@Test(groups = {"funct","broken"})
	public void testMethod1()
	{
		System.out.println("testMethod1");
	}
	
	@Test(groups = {"broken"})
	public void testMethod2()
	{
		System.out.println("tetsMethod2");
	}
	
	@Test(groups= {"broken"})
	public void tetsMethod3()
	{
		System.out.println("testMEthod3");
	}
	
	@Test(groups= {"funct"})
	public void testMethod4()
	{
		System.out.println("testMethod4");
	}
}
