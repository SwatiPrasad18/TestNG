package annotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In before Method");
	}
	
	@Test
	public void testM1()
	{
		System.out.println("In Test Method");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In after Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("In after Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("In after Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In after suite");
	}
	
}

