package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    protected HomePage homePage;
    private EventFiringWebDriver driver;
    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new EventFiringWebDriver( new ChromeDriver());

        driver.register(new EventReporter());

        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }


    public WindowManager getWindowManager()
        {
            return new WindowManager(driver);
        }

   @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if(ITestResult.FAILURE==result.getStatus()){
       var camera = (TakesScreenshot)driver;
       File Screenshoot =camera.getScreenshotAs(OutputType.FILE);
       Files.move(Screenshoot, new File("resources/screenshoots/" + result.getName() + ".png"));
       System.out.println("Screenshoot Saved At :" + Screenshoot.getAbsolutePath());
   }}

    @AfterClass
    public void tearDown()
    {
        // close my browser .close to close only the window
        driver.quit();
    }
}
