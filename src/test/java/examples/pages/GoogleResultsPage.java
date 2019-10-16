package examples.pages;

import examples.helpers.ExamplesSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage {

    private WebDriver driver;
    private ExamplesSeleniumHelpers selenium = new ExamplesSeleniumHelpers();

    private By textfieldResultStats = By.id("resultStats");

    public GoogleResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean resultStatisticsAreDisplayed(){
        return selenium.isDisplayed(driver, textfieldResultStats);
    }
}
