package answers;

import answers.helpers.AnswersSeleniumHelpers;
import answers.pages.AccountsOverviewPage;
import answers.pages.LoginPage;
import answers.pages.RequestLoanPage;
import answers.pages.RequestLoanResultPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnswersIteration7 {

    private WebDriver driver;
    private AnswersSeleniumHelpers selenium = new AnswersSeleniumHelpers();

    @Before
    public void createBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void parabankTest() {

        new LoginPage(driver).
            loadAndLoginAs("john","demo");

        new AccountsOverviewPage(driver).
            selectMenuItem("Request Loan");

        new RequestLoanPage(driver).
            submitLoanRequest("1000","100","54321");

        Assert.assertEquals(
            "Denied",
            new RequestLoanResultPage(driver).getLoanApplicationResult()
        );
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
