package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderbar = By.cssSelector("#content input");
    private By sliderValue =By.cssSelector(".sliderContainer #range");
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSlider(String value)
    {  while (!getSliderValue().equals(value))
    { driver.findElement(sliderbar).sendKeys(Keys.ARROW_RIGHT);}
    }

    public String getSliderValue()
    {
        return driver.findElement(sliderValue).getText();
    }
}
