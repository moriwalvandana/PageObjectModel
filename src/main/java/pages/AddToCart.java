package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Base;

public class AddToCart extends Base {
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement addedSuccessfullyFrame;
}
