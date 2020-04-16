package examples.basepages;

import examples.helpers.ExamplesSeleniumHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public abstract class GoogleBasePage {

    private WebDriver driver;
    private ExamplesSeleniumHelpers selenium = new ExamplesSeleniumHelpers();

    private By textfieldSearchQuery = By.name("q");

    public GoogleBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void doSearchFor(String searchQuery) {
        selenium.sendKeys(driver, textfieldSearchQuery, searchQuery);

        new Actions(driver).sendKeys(Keys.ENTER).build().perform();
    }
}
