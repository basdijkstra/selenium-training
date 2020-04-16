package answers;

import answers.basepages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnswersFinalAssignment {

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
    public void openNewAccountTest() {

        new AccountsOverviewPage(driver).
                selectMenuItem("Open New Account");

        new OpenNewAccountPage(driver).
                openNewAccount("CHECKING", "13011");

        Assert.assertTrue(
                new OpenNewAccountResultPage(driver).
                        newAccountIdIsVisible()
        );
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
