package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclss {
	
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	


	public pageclss(WebDriver driver) 
	{
		this.driver=driver;
	}



	public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typename(String username)
	{
		driver.findElement(uname).sendKeys("santhiyasanju526@gmail.com");
				
		
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("sanju@1217");
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}

}
