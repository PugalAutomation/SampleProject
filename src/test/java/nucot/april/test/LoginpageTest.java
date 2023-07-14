package nucot.april.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import nucot.april.base.Basetest;

public class LoginpageTest extends Basetest{

	
	@Test
	void getcurrentUrlTest()
	{
		String actualUrl=loginpageobj.getcurrentUrl();
		Assert.assertEquals(actualUrl, "");
	}
	@Test
	void getcurrentTitle()
	{
		String actualtitle= loginpageobj.getcurrentTitle();
		Assert.assertEquals(actualtitle, "");
	}
	@Test
	void doLoginpageTest()
	{
		   loginpageobj.doLoginpage("Admin", "admin123");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
