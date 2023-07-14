package nucot.april.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Basepagesetup.Driverintialsetup;
import nucot.april.pages.Loginpage123;

public class Basetest {

	Driverintialsetup dsobj;
	WebDriver odriver;
	protected Loginpage123 loginpageobj;
	@BeforeTest
	void setup()
	{
		dsobj=new Driverintialsetup();
		dsobj.initialBrowsesset("chrome");
		Loginpage123 loginpageobj=new Loginpage123(odriver);
	}
	
	@AfterTest
	void closeapp()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
}
