package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.Addtocartpage;
import page.Loginpage;
import wrappers.Wrappermethods;

public class Testsenarios extends Wrappermethods {


	
@Test
	public void senario1() throws InterruptedException
	{
	new Loginpage(driver).launchurl("https://fashionette.de")
	.addtocartlogin()
	.logintocart("QA@fashionette.de", "!8Ntr*BM@!#G3VH")
	.verifycart();
	

}

@Test
public void senario2() throws InterruptedException
{
	
	new Loginpage(driver)
	.launchurlandlogin("https://fashionette.de")
	.login("QA@fashionette.de", "!8Ntr*BM@!#G3VH")
	.profileupdate();
}
@Test
public void senario3() throws InterruptedException
{
	
	new Loginpage(driver)
	.launchurl("https://fashionette.de")
	.addtocartlogin()
	.logintocart("QA@fashionette.de", "!8Ntr*BM@!#G3VH")
	.applycoupon();

}

}
