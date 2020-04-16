package answers.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountResultPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By linkNewAccountId = By.id("newAccountId");

    public OpenNewAccountResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean newAccountIdIsVisible() {
        return selenium.isDisplayed(driver, linkNewAccountId);
    }
}
