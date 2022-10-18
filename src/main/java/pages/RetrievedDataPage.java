package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ContextAware;
import org.openqa.selenium.WebDriver;

public class RetrievedDataPage {
    private WebDriver driver;
    private By contentArea = By.cssSelector("body > h1");
    public RetrievedDataPage(WebDriver driver)
    {
        this.driver =driver;
    }

    public String getmassage()
    {
        return driver.findElement(contentArea).getText();
    }
}
