package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String  bottomFrame="frame-bottom";
    private String topFrame = "frame-top";

    private By Text = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextOfLeftFrame()
    {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String txt = driver.findElement(Text).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return txt;
    }

    public String getTextOfBottomFrame()
    {
        driver.switchTo().frame(bottomFrame);
        String txt = driver.findElement(Text).getText();
        driver.switchTo().parentFrame();
        return txt;
    }

}
