package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class SignUpPage
{

	public WebDriver driver;
	
	By singin=By.xpath("//a[@class='login']");
	By createaccountemail=By.xpath("//input[@id='email_create']");
	By createaccountbutton=By.xpath("//form[@id='create-account_form']//span[1]");

	public SignUpPage(WebDriver driver) {

		this.driver = driver;

	}
	
	public WebDriver clickOnSignInButton() throws InterruptedException
	{
		
		driver.findElement(singin).click();
		return driver;
		
	}
      
	public WebElement createAccount(){
		
		return driver.findElement(createaccountemail);
		
		
	}
	
	public WebElement cliclOnCreateAccountButton() {
		return driver.findElement(createaccountbutton);
		
		
	}
}
