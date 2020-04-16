package answers.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.*;

public abstract class BasePage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMenuItem(String linkText) {
        selenium.click(driver, By.linkText(linkText));
    }
}
