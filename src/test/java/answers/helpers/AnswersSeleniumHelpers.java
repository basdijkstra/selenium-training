package answers.helpers;

import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnswersSeleniumHelpers {

    public AnswersSeleniumHelpers() {
    }

    public void click(WebDriver driver, By by) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).click();
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in click(): %s", te.getMessage()));
        }
    }

    public void sendKeys(WebDriver driver, By by, String textToType) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).sendKeys(textToType);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in sendKeys(): %s", te.getMessage()));
        }
    }

    public void select(WebDriver driver, By by, String valueToSelect) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            new Select(driver.findElement(by)).selectByVisibleText(valueToSelect);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in select(): %s", by.toString()));
        }
    }

    public void selectWithWait(WebDriver driver, By by, String valueToSelect) {

        try {
            new WebDriverWait(driver, 10).
                    until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, By.xpath("//option[text()='"+ valueToSelect +"']")));
            new Select(driver.findElement(by)).selectByVisibleText(valueToSelect);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in selectWithWait(): %s", te.getMessage()));
        }
    }

    public boolean isDisplayed(WebDriver driver, By by) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }
        catch (TimeoutException te) {
            return false;
        }
    }

    public String getElementText(WebDriver driver, By by) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));
            return driver.findElement(by).getText();
        }
        catch (TimeoutException te) {
            return "Element not found";
        }
    }
}
