package exercises.pages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanResultPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    /***
     * Define a private object of type By that represent the loan request result as shown on screen
     */

    public RequestLoanResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoanApplicationResult() {

        /***
         * Change the implementation of this method so that it returns
         * the actual loan request result as shown on screen
         */

        return "";
    }
}
