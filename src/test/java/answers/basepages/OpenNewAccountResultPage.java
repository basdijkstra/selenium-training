package answers.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountResultPage extends BasePage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium;

    private By linkNewAccountId = By.id("newAccountId");

    public OpenNewAccountResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        selenium = new AnswersSeleniumHelpers(driver);
    }

    public String getNewAccountId() {
        return selenium.getElementText(linkNewAccountId);
    }
}
