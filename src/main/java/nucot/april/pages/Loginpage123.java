package nucot.april.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

   



public class Loginpage123 {
	
	public WebDriver odriver;
	
	    private By userName=By.xpath("//input[@name='username']");
	    private By passWord=By.xpath("//input[@name='password']");
	    private By submit = By.xpath("//button[@type='submit']");
	    
	public Loginpage123(WebDriver odriver)
	{
		
		this.odriver=odriver;
	}
	
	

	public String getcurrentUrl()
	{
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public String getcurrentTitle()
	{
		  String title= odriver.getTitle();
		  System.out.println(title);
		  return title;
	}
	
 public void doLoginpage(String username,String password) 
 {
	odriver.findElement(userName).sendKeys("Admin");
	odriver.findElement(passWord).sendKeys("admin123");
	odriver.findElement(submit).click();
	
	 
	 
 }

}
