package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String iframeEditorId = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    private By increaseIndentButton = By.cssSelector("button[title='Increase indent']");
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String txt)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(txt);
        switchToMainArea();
    }

    public String getTextArea( )
    {
        switchToEditArea();
       String text= driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


    public void clickOnincreaseIndentButton()
    {
        driver.findElement(increaseIndentButton).click();
    }

    private void switchToEditArea()
    {
        driver.switchTo().frame(iframeEditorId);
    }
    // it is a best practice to come back to main frame
    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }


}
