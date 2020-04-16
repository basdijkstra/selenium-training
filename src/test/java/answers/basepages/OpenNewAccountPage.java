package answers.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By dropdownAccountType = By.id("type");
    private By dropdownFromAccountId = By.id("fromAccountId");
    private By buttonOpenNewAccount = By.xpath("//input[@value='Open New Account']");

    public OpenNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openNewAccount(String accountType, String fromAccountId) {

        selenium.select(driver, dropdownAccountType, accountType);
        selenium.selectWithWait(driver, dropdownFromAccountId, fromAccountId);
        selenium.click(driver, buttonOpenNewAccount);
    }
}
