package pom.base;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import pom.eviroments.Environment;
import pom.userActions.UserActions;

public class BasePage {
    protected WebDriver driver;
    protected UserActions userActions ;
    protected Environment environment ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        userActions = new UserActions(driver);
        environment= ConfigFactory.create(Environment.class) ;
    }

    protected void load(String endpoint){
//        driver.get(ConfigLoader.getInstance().getBaseURL() + endpoint);
        driver.get(environment.getBaseURL() + endpoint );
    }

}
