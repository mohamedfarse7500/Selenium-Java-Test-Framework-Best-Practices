package pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.base.BaseTest;
import pom.objects.BillingAddress;
import pom.objects.Product;
import pom.pages.CartPage;
import pom.pages.CheckoutPage;
import pom.pages.HomePage;
import pom.pages.StorePage;
import pom.utils.JacksonUtils;

import java.io.IOException;


public class MyTest extends BaseTest {


    @Test
    public void firstTest() throws IOException {

        BillingAddress billingAddress = JacksonUtils.deserializeJson("billingAddress.json", BillingAddress.class);
        Product product = new Product(1215);
        HomePage homePage = new HomePage(getDriver()).load();
        StorePage storePage = homePage.clickonstoreMenuLink();
        storePage.search("blue");
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        storePage.clickOnAddToCartButton(product.getName());
        CartPage cartPage = storePage.clickOnViewCartLink();
        Assert.assertEquals(cartPage.getProductName(), product.getName());
        CheckoutPage checkoutPage = cartPage.clickOnCheckoutButton();
        checkoutPage.setBillingAddress(billingAddress).selectDirectBankTransfer().clickOnPlaceHolderButton();
        Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you. Your order has been received.");

    }
    @Test
    public void secondTest() throws IOException {

        BillingAddress billingAddress = JacksonUtils.deserializeJson("billingAddress.json", BillingAddress.class);
        Product product = new Product(1215);
        HomePage homePage = new HomePage(getDriver()).load();
        StorePage storePage = homePage.clickonstoreMenuLink();
        storePage.search("blue");
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        storePage.clickOnAddToCartButton(product.getName());
        CartPage cartPage = storePage.clickOnViewCartLink();
        Assert.assertEquals(cartPage.getProductName(), product.getName());
        CheckoutPage checkoutPage = cartPage.clickOnCheckoutButton();
        checkoutPage.setBillingAddress(billingAddress).selectDirectBankTransfer().clickOnPlaceHolderButton();
        Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you. Your order has been received.");

    }
    @Test
    public void ThirdTest() throws IOException {

        BillingAddress billingAddress = JacksonUtils.deserializeJson("billingAddress.json", BillingAddress.class);
        Product product = new Product(1215);
        HomePage homePage = new HomePage(getDriver()).load();
        StorePage storePage = homePage.clickonstoreMenuLink();
        storePage.search("blue");
        Assert.assertEquals(storePage.getTitle(), "Search results: “blue”");
        storePage.clickOnAddToCartButton(product.getName());
        CartPage cartPage = storePage.clickOnViewCartLink();
        Assert.assertEquals(cartPage.getProductName(), product.getName());
        CheckoutPage checkoutPage = cartPage.clickOnCheckoutButton();
        checkoutPage.setBillingAddress(billingAddress).selectDirectBankTransfer().clickOnPlaceHolderButton();
        Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you. Your order has been received.");

    }
}
