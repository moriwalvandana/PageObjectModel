package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class WomenSectionPage extends Base {

	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	WebElement women;

	@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//li//ul//a[contains(text(),'T-shirts')]")
	WebElement tShirt;

	@FindBy(xpath = "//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")
	WebElement shortSleeveTshirt;

	// Initializing the Page Objects:
	public WomenSectionPage() {
		PageFactory.initElements(driver, this);

	}

	public void womenTab() {
		
		 Actions builder = new Actions(driver);
		 builder.moveToElement(women).perform();

	}

}
