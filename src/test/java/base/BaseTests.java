package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver webDriver;
    protected HomePage homePage;
    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();

        // open My website
        goHome();
        homePage = new HomePage(webDriver);

        //1 - Maximize the window
        webDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome()
    {
        webDriver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown()
    {
        // close my browser .close to close only the window
        webDriver.quit();
    }
}
