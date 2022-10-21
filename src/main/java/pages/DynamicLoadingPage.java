package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By example2 = By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public DynamicallyLoadedExample1Page clickOnExample1()
    {
        driver.findElement(example1).click();
        return new DynamicallyLoadedExample1Page(driver);
    }

    public DynamicallyLoadedExample2Page clickOnExample2()
    {
        driver.findElement(example2).click();
        return new DynamicallyLoadedExample2Page(driver);
    }

    public DynamicallyLoadedExample2Page rightclickOnExample2()
    {
        driver.findElement(example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicallyLoadedExample2Page(driver);
    }
}
