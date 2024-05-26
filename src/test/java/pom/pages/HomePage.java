package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By storeMenuLink = By.xpath("//li[@id='menu-item-1227']/a");

    public StorePage clickonstoreMenuLink()
    {
        userActions.clickOnElement(storeMenuLink);
        return new StorePage(driver);
    }
    public HomePage load(){
        super.load("/");
        return this;
    }

}
