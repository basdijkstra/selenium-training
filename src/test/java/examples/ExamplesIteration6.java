package examples;

import examples.helpers.ExamplesSeleniumHelpers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplesIteration6 {

    private WebDriver driver;
    private ExamplesSeleniumHelpers helpers = new ExamplesSeleniumHelpers();

    @Before
    public void createBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleTest() {

        driver.get("https://www.google.com");

        helpers.sendKeys(driver, By.name("q"), "Belastingdienst");
        helpers.click(driver, By.name("btnK"));

        Assert.assertTrue(helpers.isDisplayed(driver, By.id("resultStats")));
    }

    @Test
    public void dropdownTest() {

        driver.get("https://html.com/tags/select/");

        helpers.select(driver, By.xpath("(//select)[1]"), "Chilean Flamingo");
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
