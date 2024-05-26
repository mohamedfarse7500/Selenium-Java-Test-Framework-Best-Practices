package pom.userActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UserActions {
    protected  WebDriver driver;
    protected  WebDriverWait wait;

    public UserActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public  void clickOnElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public  void sendText(By locator, String txt) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(txt);

    }

    public  String extractText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    public  void selectFromDropDownListByName(By locator,String name) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(name);
    }
    public void waitForOverLayDisappear(By overLay)
    {
        List<WebElement> overLays=driver.findElements(overLay);
        if(!overLays.isEmpty())
        {
            wait.until(ExpectedConditions.invisibilityOfAllElements(overLays));
        }
    }
    public void srollToElemet(By locator)
    {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }
}
