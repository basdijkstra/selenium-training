package examples.pages;

import examples.helpers.ExamplesSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage {

    private WebDriver driver;
    private ExamplesSeleniumHelpers selenium;

    private By textfieldResultStats = By.id("resultStats");

    public GoogleResultsPage(WebDriver driver) {
        this.driver = driver;
        selenium = new ExamplesSeleniumHelpers(driver);
    }

    public boolean resultStatisticsAreDisplayed(){
        return selenium.isDisplayed(textfieldResultStats);
    }
}
