package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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
        webDriver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(webDriver);
        //1 - Maximize the window
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown()
    {
        // close my browser .close to close only the window
        webDriver.quit();
    }
}
