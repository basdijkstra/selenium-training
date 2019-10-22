package answers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AnswersIteration5 {

    private WebDriver driver;

    @Before
    public void createBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void parabankTest() {

        driver.get("http://parabank.parasoft.com");

        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        driver.findElement(By.linkText("Request Loan")).click();
        driver.findElement(By.id("amount")).sendKeys("1000");
        driver.findElement(By.id("downPayment")).sendKeys("100");
        Select dropdownFromAccountId = new Select(driver.findElement(By.id("fromAccountId")));
        dropdownFromAccountId.selectByVisibleText("54321");
        driver.findElement(By.xpath("//input[@value='Apply Now']")).click();

        String result = driver.findElement(By.id("loanStatus")).getText();
        Assert.assertEquals("Denied", result);
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
