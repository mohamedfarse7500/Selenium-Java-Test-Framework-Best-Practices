package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;
import pom.objects.BillingAddress;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameField = By.xpath("//input[@id='billing_first_name']");
    private final By lastNameField = By.xpath("//input[@id='billing_last_name']");
    private final By addressLineField = By.xpath("//input[@id='billing_address_1']");
    private final By cityField = By.xpath("//input[@id='billing_city']");
    private final By postCodeField = By.xpath("//input[@id='billing_postcode']");
    private final By emailField = By.xpath("//input[@id='billing_email']");
    private final By placeHolderButton = By.xpath("//button[@id='place_order']");
    private final By successmessage = By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']");
    private final By overlayed =By.xpath("//*[@class='blockUI blockOverlay']");
    private final By countryDropDownList=By.xpath("//span[@id=\"select2-billing_country-container\"]");
    private final By stateDropDownList=By.xpath("//span[@id=\"select2-billing_state-container\"]");
    private final By directFinalTransfer=By.xpath("//input[@id=\"payment_method_bacs\"]");



    public CheckoutPage enterFirstName(String firstName) {
        userActions.sendText(firstNameField,firstName);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        userActions.sendText(lastNameField,lastName);
        return this;
    }
    private By getCountryElement(String countryName){
        return  By.xpath(String.format("//li[normalize-space()='%s']",countryName));

    }
    public CheckoutPage selectCountry(String countryName){

        userActions.clickOnElement(countryDropDownList);
        userActions.srollToElemet(getCountryElement(countryName));
        userActions.clickOnElement(getCountryElement(countryName));
        return this;
    }

    private By getStateElement(String stateName){
        return  By.xpath(String.format("//li[normalize-space()='%s']",stateName));

    }
    public CheckoutPage selectState(String stateName){
        userActions.clickOnElement(stateDropDownList);
        userActions.srollToElemet(getStateElement(stateName));
        userActions.clickOnElement(getStateElement(stateName));
        return this;
    }
    public CheckoutPage enterAddressLine(String addressLine) {
        userActions.sendText(addressLineField,addressLine);
        return this;
    }

    public CheckoutPage enterCity(String city) {
        userActions.sendText(cityField,city);
        return this;
    }

    public CheckoutPage enterPostCode(String postCode) {
        userActions.sendText(postCodeField,postCode);
        return this;
    }

    public CheckoutPage enterEmail(String email) {
        userActions.sendText(emailField,email);
        return this;
    }
    public CheckoutPage selectDirectBankTransfer(){
        userActions.waitForOverLayDisappear(overlayed);
        userActions.clickOnElement(directFinalTransfer);
        return this;
    }
    public CheckoutPage clickOnPlaceHolderButton()  {

        userActions.clickOnElement(placeHolderButton);
        return this;
    }

    public String getSuccessMessage() {
        return userActions.extractText(successmessage);
    }

    public CheckoutPage setBillingAddress(BillingAddress billingAddress) {
        enterFirstName(billingAddress.getFirstName())
                .enterLastName(billingAddress.getLastName())
                .selectCountry(billingAddress.getCountryName())
                .selectState(billingAddress.getStateName())
                .enterAddressLine(billingAddress.getAddressLine())
                .enterCity(billingAddress.getCity())
                .enterPostCode(billingAddress.getPostCode())
                .enterEmail(billingAddress.getEmail());
        return this;
    }
}
