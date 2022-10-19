package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlartsPage {
    private WebDriver driver;
    private By jsAlartButton = By.cssSelector(".example > ul > li:nth-child(1) > button");
    private By jsConfirmButton = By.cssSelector(".example > ul > li:nth-child(2) > button");
    private By jsPromotButton = By.cssSelector(".example > ul > li:nth-child(3) > button");
    private By resultMassage = By.id("result");
    public AlartsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnJsAlartButton()
    {
        driver.findElement(jsAlartButton).click();
    }

    public void clickOnJsConfirmButton()
    {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickOnJsPromotButton()
    {
        driver.findElement(jsPromotButton).click();
    }
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void cancelAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getMassage()
    {
      return   driver.findElement(resultMassage).getText();
    }

    public String getAlertText()
    {
       return driver.switchTo().alert().getText();
    }

    public void setAlertMassage(String massage)
    {
        driver.switchTo().alert().sendKeys(massage);
    }

}
