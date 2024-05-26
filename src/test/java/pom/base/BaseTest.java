package pom.base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pom.factory.DriverManager;

public class BaseTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public WebDriver getDriver() {
        return this.driver.get();
    }

    @Parameters("Browser")
    @BeforeMethod
    public void startDriver(String browser) {
         browser = System.getProperty("Browser",browser);
        setDriver(new DriverManager().initializeDriver(browser));
    }


  @AfterMethod
    public void quiteDriver() {
        getDriver().quit();

        System.out.println("Current Thread is " + Thread.currentThread().threadId());
    }
}
