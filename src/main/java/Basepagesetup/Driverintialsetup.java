package Basepagesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driverintialsetup {

	public WebDriver odriver;
	
	
	public WebDriver initialBrowsesset(String browserName)
	{
	  if(browserName.equals("chrome"))
	  {
		  odriver =new ChromeDriver();
	  }
		
	  else if(browserName.equals("firefox"))
	  {
		  odriver =new FirefoxDriver();
	  }
	  else if (browserName.equals("edge"))
	  {
		  odriver =new EdgeDriver();
	  }
	  else if (browserName.equals("safari"))
	  {
		  odriver =new SafariDriver();
		  
	  }	
		
	  else
	  {
		  System.out.println("pls launch valid browser");
	  }
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
		return odriver;
		
	}
	
	
	
	
	
	
	
	
	
	
}
