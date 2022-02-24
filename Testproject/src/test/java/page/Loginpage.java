package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wrappers.Wrappermethods;

public class Loginpage extends Wrappermethods {
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}


public String profileicon = "(//div[@class='header__icon']/a)[1]";
	String username = "//input[@name='email']";
	String password = "//input[@name='password']";
	String submit = "(//button[@type='submit'])[1]";
	public Loginpage login(String uservalue, String passwordvalue) throws InterruptedException
	{
		
		clickelement(profileicon);
		enterelement(username, uservalue);
		enterelement(password , passwordvalue);
		clickelement(submit);
		
		return this;
		
	}
	public void profileupdate() throws InterruptedException
	{
		clickelement("//div[@class='account-personaldata']/a");
		clickelement("(//div[@class='account--personaldata']//div)[5]");
		enterelement("//input[@name='first_name']","william" );
		enterelement("//input[@name='last_name']","rock" );
		clickelement("//div[text()='Speichern']");
		closebrowser();
		
		 
		 
	}
	
	public Addtocartpage logintocart(String uservalue, String passwordvalue) throws InterruptedException
	{
		
		clickelement(profileicon);
		enterelement(username, uservalue);
		enterelement(password , passwordvalue);
		clickelement(submit);
		
		return new Addtocartpage(driver);
		
	}
	public Addtocartpage  launchurl(String args) throws InterruptedException
	{
		launchbrowser();
		loadURL(args);
		
		return new Addtocartpage(driver);
		
	}
	
	public Loginpage  launchurlandlogin(String args) throws InterruptedException
	{
		launchbrowser();
		loadURL(args);
		
		return this;
		
	}
}

