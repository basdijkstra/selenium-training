package answers.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewPage extends BasePage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium;

    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        selenium = new AnswersSeleniumHelpers(driver);
    }

    public boolean accountIsVisible(String accountNumber) {

        return selenium.isDisplayed(By.linkText(accountNumber));
    }
}
