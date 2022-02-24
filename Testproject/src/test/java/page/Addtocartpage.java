package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import wrappers.Wrappermethods;

public class Addtocartpage extends Wrappermethods{
	
	public Addtocartpage(WebDriver driver)
	{
		this.driver=driver;
	}

 public Addtocartpage addtocart() throws InterruptedException
 { 
	 clickelement("//li[@data-id='handbags']/a");
	 clickelement("(//div[@itemscope='itemscope']//div[@itemscope='itemscope']/div)[1]");
	 clickelement("(//div[@class='btn__content'])[3]");
	 
	 return this;
	 
 }
	public void verifycart() throws InterruptedException
	{
		clickelement("//span[@class='cart-amount']");
		verifytext();
		closebrowser();
		 
	}
	
	 public Loginpage addtocartlogin() throws InterruptedException
	 { 
		 clickelement("//li[@data-id='handbags']/a");
		 clickelement("(//div[@itemscope='itemscope']//div[@itemscope='itemscope']/div)[1]");
		 clickelement("(//div[@class='btn__content'])[3]");
		 
		 return new Loginpage(driver);
		 
	 }
	 public void applycoupon() throws InterruptedException
		{
			clickelement("//span[@class='cart-amount']");
			clickelementwithcatch("(//tr[3]//span)[2]");
			clickelementwithcatch("//div[@class='btn-default ']");
			clickelement("//tr[3]/th");
		
			enterelement("//input[@name='voucherCode']","qachallenge");
			clickelement("(//button[@type='submit'])[1]");
			

			
			closebrowser();
			
		}
	
}
