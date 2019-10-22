package exercises.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /***
     * Implement a selectMenuItem() method that takes a String argument
     * and performs a click on the element with a linkText equal to the String argument
     */
}