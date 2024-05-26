package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }

    private final By searchField = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private final By searchButton = By.xpath("//button[@type='submit']");
    private final By title = By.xpath("//header[@class='woocommerce-products-header']/h1[@class='woocommerce-products-header__title page-title']");

    private final  By viewCartLink =By.xpath("//a[@title='View cart']");


    public StorePage enterTextInSearchField(String txt) {

        userActions.sendText(searchField,txt);
        return this;
    }
    public StorePage clickOnSearchButton(){

        userActions.clickOnElement(searchButton);
        return this;
    }

    public StorePage search(String txt)
    {
        enterTextInSearchField(txt).clickOnSearchButton();
        return this;
    }
    public String getTitle() {

        return userActions.extractText(title);

    }
    private By getAddtoCartElement(String productName)
    {
        return  By.xpath(String.format("//a[@aria-label='Add “%s” to your cart']",productName));

    }
    public StorePage clickOnAddToCartButton(String productName){
        userActions.clickOnElement(getAddtoCartElement(productName));
        return this;
    }
    public CartPage clickOnViewCartLink(){
        userActions.clickOnElement(viewCartLink);
        return new CartPage(driver);
    }
}
