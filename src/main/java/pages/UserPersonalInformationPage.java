package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPersonalInformationPage {

	public WebDriver driver;
	public WebElement elm;

	public UserPersonalInformationPage(WebDriver driver) {

		this.driver = driver;

	}

// Personal information
	By title = By.xpath("//label[contains(text(),'Title')]");
	By mrs = By.xpath("//div[@id='uniform-id_gender2']");
	By mr = By.xpath("//input[@id='id_gender1']");
	By customerfirstname = By.xpath("//input[@id='customer_firstname']");
	By customerlastname = By.xpath("//input[@id='customer_lastname']");
	By password = By.xpath("//input[@id='passwd']");
	By dobdate = By.xpath("//select[@id='days']");
	By dobmonth = By.xpath("//select[@id='months']");
	By dobyear = By.xpath("//select[@id='years']");
	By newsletter = By.xpath("//input[@id='newsletter']");
	By specialoffer = By.xpath("//input[@id='optin']");
// Address details

	By firstname = By.xpath("//input[@id='firstname']");
	By lastname = By.xpath("//input[@id='lastname']");
	By companyname = By.xpath("//input[@id='company']");
	By address = By.xpath("//input[@id='address1']");
	By addreesline = By.xpath("//input[@id='address2']");
	By city = By.xpath("//input[@id='city']");
	By state = By.xpath("//select[@id='id_state']");
	By postalcode = By.xpath("//input[@id='postcode']");
	By country = By.xpath("//select[@id='id_country']");
	By mobilenumber = By.xpath("//input[@id='phone_mobile']");
	By home = By.xpath("//input[@id='alias']");
	By registerbutton = By.xpath("//span[contains(text(),'Register')]");
	
	By accounttitle=By.xpath("//h1[@class='page-heading']");

	public void personalInformation() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(mrs).click();
		driver.findElement(customerfirstname).sendKeys("Neha");
		driver.findElement(customerlastname).sendKeys("Thakur");
		driver.findElement(password).sendKeys("xxxxx");
		driver.findElement(dobdate).sendKeys("5");
		driver.findElement(dobmonth).sendKeys("May");
		driver.findElement(dobyear).sendKeys("1990");
	
	}
	
	public void addressDetails() {
		
		driver.findElement(firstname).sendKeys("Neha");
		driver.findElement(lastname).sendKeys("Thakur");
	    driver.findElement(companyname).sendKeys("MoEngage");
	    driver.findElement(address).sendKeys("MoEngage");
	    driver.findElement(addreesline).sendKeys("sector 15");
	    driver.findElement(city).sendKeys("Bangalore");
	    driver.findElement(state).sendKeys("Karanataka");
	    driver.findElement(postalcode).sendKeys("12200");
	    driver.findElement(country).sendKeys("India");
	    driver.findElement(mobilenumber).sendKeys("9090445566");
	    driver.findElement(home).sendKeys("Home");
	    driver.findElement(registerbutton).click();
	}

	public void accountCreated() {
		
	String tt=driver.findElement(accounttitle).getText();
	System.out.println(tt);
	
	
	}
}
