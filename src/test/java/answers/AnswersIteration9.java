package answers;

import answers.basepages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnswersIteration9 {

    private WebDriver driver;

    @Before
    public void createBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        new LoginPage(driver).
            loadAndLoginAs("john","demo");
    }

    @Test
    public void requestLoan_validParameters_shouldbeApproved() {

        new AccountsOverviewPage(driver).
            selectMenuItem("Request Loan");

        new RequestLoanPage(driver).
            submitLoanRequest("1000","100","54321");

        Assert.assertEquals(
            "Approved",
            new RequestLoanResultPage(driver).getLoanApplicationResult()
        );

        new RequestLoanResultPage(driver).
                selectMenuItem("Log Out");
    }

    @Test
    public void openNewAccount_validParameters_shouldSucceed() {

        new AccountsOverviewPage(driver).
                selectMenuItem("Open New Account");

        new OpenNewAccountPage(driver).
                openNewAccount("SAVINGS", "54321");

        String newAccountId = new OpenNewAccountResultPage(driver).
                getNewAccountId();

        new OpenNewAccountResultPage(driver).
                selectMenuItem("Accounts Overview");

        Assert.assertTrue(
                new AccountsOverviewPage(driver)
                        .accountIsVisible(newAccountId)
        );
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}