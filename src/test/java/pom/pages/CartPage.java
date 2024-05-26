package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By productName = By.xpath("//td[@class='product-name']/a");
    private final By checkoutButton = By.xpath("//a[normalize-space()='Proceed to checkout']");

    public String getProductName() {
        return userActions.extractText(productName);
    }

    public CheckoutPage clickOnCheckoutButton() {
        userActions.clickOnElement(checkoutButton);
        return new CheckoutPage(driver);
    }
}
