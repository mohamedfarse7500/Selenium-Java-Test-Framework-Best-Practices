package pom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public WebDriver initializeDriver(String browser) {

        WebDriver driver = switch (BrowsersType.valueOf(browser.toUpperCase())) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            case EDGE -> new EdgeDriver();
            default -> throw new IllegalStateException(String.format("Invalid browser name: %s", browser));
        };
        driver.manage().window().maximize();
        return driver;

    }
}
