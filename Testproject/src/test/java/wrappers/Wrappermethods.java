package wrappers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrappermethods {
public WebDriver driver=null;

	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\browserdriver\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
	
	public void clickelementwithcatch(String Xpath) throws InterruptedException
	{
		try
		{
		Thread.sleep(5000);
		driver.findElement(By.xpath(Xpath)).click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void loadURL(String URL) throws InterruptedException
	{
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String str="return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"#uc-center-container > div.sc-jJoQJp.dTzACB > div > div.sc-bBHxTw.hgPqkm > div > button\")";
		   WebElement ele= (WebElement) ((JavascriptExecutor) driver).executeScript(str);
	       ele.click();
	}
	
	public void clickelement(String Xpath) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(Xpath)).click();
		
	}
	
	public void enterelement(String Xpath,String value) throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement ele =driver.findElement(By.xpath(Xpath));
		ele.clear();
		ele.sendKeys(value);
	}
	public void explictwait(int time,String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	public void verifytext() throws InterruptedException
	{
		Thread.sleep(6000);
		String actual = driver.findElement(By.xpath("(//div[@class='cart-item--description']/div)[1]")).getText().trim();
        
		if(actual.equals("AIGNER"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	public void verifycoupon()
	{
		driver.findElement(By.xpath("//tr[3]//td/span[contains(text(),'-2')]")).isDisplayed();
	}
	public void closebrowser()
	{
		driver.quit();
	}
}

