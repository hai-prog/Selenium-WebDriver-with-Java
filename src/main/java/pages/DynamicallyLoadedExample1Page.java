package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicallyLoadedExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadingIndicator = By.id("loading");
    private By loadedText= By.id("finish");


    public DynamicallyLoadedExample1Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnStartButton()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        // fluent wait is more flexible

        /*
        FluentWait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        */

    }

    public String getText()
    {
        return driver.findElement(loadedText).getText();
    }
}
