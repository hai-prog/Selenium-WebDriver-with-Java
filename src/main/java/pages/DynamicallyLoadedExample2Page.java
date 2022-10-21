package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedText= By.id("finish");


    public DynamicallyLoadedExample2Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnStartButton()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getText()
    {
       return driver.findElement(loadedText).getText();
    }

    public boolean checkStartButtonVisiability()
    {
        return driver.findElement(startButton).isDisplayed();
    }


}
