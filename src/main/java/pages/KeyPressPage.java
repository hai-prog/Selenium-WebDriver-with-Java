package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By textField = By.id("target");
    private By textAppeared = By.id("result");
    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextField(String txt)
    {
        driver.findElement(textField).sendKeys(txt);
    }

    public void enterDollarSign()
    {
        setTextField(Keys.chord(Keys.SHIFT, "4"));
    }
    public String getText()
    {
       return driver.findElement(textAppeared).getText();
    }
}
