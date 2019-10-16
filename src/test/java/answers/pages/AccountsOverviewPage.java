package answers.pages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverviewPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    public AccountsOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMenuItem(String menuItem) {
        selenium.click(driver, By.linkText(menuItem));
    }
}
