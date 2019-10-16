package exercises.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/***
 * Make the RequestLoanResultPage inherit from the BasePage
 */

public class RequestLoanResultPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By textfieldApplicationResult = By.id("loanStatus");

    public RequestLoanResultPage(WebDriver driver) {
        /***
         * Pass the WebDriver object to the constructor of the BasePage here
         */
        this.driver = driver;
    }

    public String getLoanApplicationResult() {
        return selenium.getElementText(driver, textfieldApplicationResult);
    }
}
