/*
 * can include or exclude methods at individual level
 */
package annotations;

import org.testng.annotations.Test;

public class MethodGroups_3 {

	@Test
	public void enableTestMethod1() 
	{
		System.out.println("Enabled Test1");
	}
	
	@Test
	public void enableTestMethod2()
	{
		System.out.println("Enabled Test2");
	}
	
	@Test
	public void disabledTestMethod1()
	{
		System.out.println("Disabled Test1");
	}
	
	@Test
	public void disabledTestMethod2()
	{
		System.out.println("Disabled Test2");
	}
		
}
