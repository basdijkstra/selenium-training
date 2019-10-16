package answers.pages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanResultPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By textfieldApplicationResult = By.id("loanStatus");

    public RequestLoanResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoanApplicationResult() {
        return selenium.getElementText(driver, textfieldApplicationResult);
    }
}
