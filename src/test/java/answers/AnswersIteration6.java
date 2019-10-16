package answers;

import answers.helpers.AnswersSeleniumHelpers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnswersIteration6 {

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

        driver.get("http://parabank.parasoft.com");

        selenium.sendKeys(driver, By.name("username"), "john");
        selenium.sendKeys(driver, By.name("password"), "demo");
        selenium.click(driver, By.xpath("//input[@value='Log In']"));

        selenium.click(driver, By.linkText("Request Loan"));
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
