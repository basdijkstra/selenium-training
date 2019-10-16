package examples.pages;

import examples.helpers.ExamplesSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    private WebDriver driver;
    private ExamplesSeleniumHelpers selenium = new ExamplesSeleniumHelpers();

    private By textfieldSearchQuery = By.name("q");
    private By buttonDoSearch = By.name("btnK");

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleHomePage load() {
        driver.get("https://www.google.com");
        return this;
    }

    public GoogleHomePage enterSearchTerm(String searchQuery) {
        selenium.sendKeys(driver, textfieldSearchQuery, searchQuery);
        return this;
    }

    public void clickSearchButton() {
        selenium.click(driver, buttonDoSearch);
    }

    public void loadAndSearchFor(String searchQuery) {
        load().enterSearchTerm(searchQuery).clickSearchButton();
    }
}
