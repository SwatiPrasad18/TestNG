/*
 *  can define groups at class level and then groups at method level
 */
package annotations;

import org.testng.annotations.Test;

@Test(groups = {"TestAll"})
public class PartialGroups_6 {
	
	@Test(groups = {"F1"})
	public void testM1()
	{
		System.out.println("testM1");
	}

	@Test(groups = {"F2"})
	public void testM2()
	{
		System.out.println("testM2");
	}
	
}
