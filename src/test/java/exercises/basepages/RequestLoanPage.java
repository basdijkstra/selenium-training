package exercises.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By textfieldLoanAmount = By.id("amount");
    private By textfieldDownPayment = By.id("downPayment");
    private By dropdownFromAccountId = By.id("fromAccountId");
    private By buttonApplyForLoan = By.xpath("//input[@value='Apply Now']");

    public RequestLoanPage(WebDriver driver) {
        this.driver = driver;
    }

    public RequestLoanPage enterLoanAmount(String loanAmount) {
        selenium.sendKeys(driver, textfieldLoanAmount, loanAmount);
        return this;
    }

    public RequestLoanPage enterDownPayment(String downPayment) {
        selenium.sendKeys(driver, textfieldDownPayment, downPayment);
        return this;
    }

    public RequestLoanPage selectFromAccountId(String fromAccountId) {
        selenium.select(driver, dropdownFromAccountId, fromAccountId);
        return this;
    }

    public void doApplyNow() {
        selenium.click(driver, buttonApplyForLoan);
    }

    public void submitLoanRequest(String loanAmount, String downPayment, String fromAccountId) {
        enterLoanAmount(loanAmount).
            enterDownPayment(downPayment).
            selectFromAccountId(fromAccountId).
            doApplyNow();
    }
}
