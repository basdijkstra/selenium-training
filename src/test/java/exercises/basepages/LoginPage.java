package exercises.basepages;

import answers.helpers.AnswersSeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    private By textfieldUsername = By.name("username");
    private By textfieldPassword = By.name("password");
    private By buttonDoLogin = By.xpath("//input[@value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage load() {
        driver.get("http://parabank.parasoft.com");
        return this;
    }

    public LoginPage enterUsername(String username) {
        selenium.sendKeys(driver, textfieldUsername, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        selenium.sendKeys(driver, textfieldPassword, password);
        return this;
    }

    public void doLogin() {
        selenium.click(driver, buttonDoLogin);
    }

    public void loadAndLoginAs(String username, String password) {
        load().enterUsername(username).enterPassword(password).doLogin();
    }
}
