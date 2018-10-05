package annotations;

import org.testng.annotations.Test;

public class GroupOfGroups_4 {

	@Test(groups = {"smoke"})
	public void testMethod1()
	{
		System.out.println("Smoke1");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void testMethod2()
	{
		System.out.println("Smoke2/Sanity1");
	}
	
	@Test(groups = {"sanity"})
	public void testMethod3()
	{
		System.out.println("Sanity2");
	}
	
	@Test(groups = {"unix1"})
	public void testMethod4()
	{
		System.out.println("Unix1");
	}
	
	@Test(groups = {"windows"})
	public void testMethod5()
	{
		System.out.println("windows1");
	}
}
