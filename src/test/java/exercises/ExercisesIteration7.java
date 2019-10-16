package exercises;

import answers.helpers.AnswersSeleniumHelpers;
import exercises.pages.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercisesIteration7 {

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

        /***
         * Replace the methods below by the methods that you created
         * in the Page Objects
         */

        selenium.sendKeys(driver, By.id("amount"), "1000");
        selenium.sendKeys(driver, By.id("downPayment"), "100");
        selenium.select(driver, By.id("fromAccountId"), "54321");
        selenium.click(driver, By.xpath("//input[@value='Apply Now']"));

        Assert.assertEquals("Denied", selenium.getElementText(driver, By.id("loanStatus")));
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
