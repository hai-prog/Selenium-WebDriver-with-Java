package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnTheBox()
    {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotBox)).perform();
    }

    public String getAlertText()
    {
       return driver.switchTo().alert().getText();
    }

    public void acceptTheAlert()
    {
        driver.switchTo().alert().accept();
    }

}
