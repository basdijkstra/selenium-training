package exercises.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * Make the AccountsOverviewPage inherit from the BasePage
 */

public class AccountsOverviewPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    public AccountsOverviewPage(WebDriver driver) {
        /***
         * Pass the WebDriver object to the constructor of the BasePage here
         */
        this.driver = driver;
    }

    /***
     * Remove this method entirely, because we won't need it anymore.
     */

    public void selectMenuItem(String menuItem) {
        selenium.click(driver, By.linkText(menuItem));
    }
}
