package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index start at 1
     */
    public FigureCaption hoverOverFigure(int index)
    {
        Actions action = new Actions(driver);
        WebElement figure = driver.findElements(figureBox).get(index-1);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption
    {
        private WebElement figureCaption;
        private By header = By.tagName("h5");
        private By profile = By.tagName("a");

        public FigureCaption(WebElement figureCaption)
        {
            this.figureCaption=figureCaption;
        }

        public boolean isCaptionDisplayed()
        {
           return figureCaption.isDisplayed();
        }

        public String getTitle()
        {
          return figureCaption.findElement(header).getText();
        }

        public String getLink()
        {
            return figureCaption.findElement(profile).getAttribute("href");
        }

        public String getLinkText()
        {
            return figureCaption.findElement(profile).getText();
        }


    }
}
