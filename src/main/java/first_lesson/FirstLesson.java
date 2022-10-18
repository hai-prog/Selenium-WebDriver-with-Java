package first_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstLesson {
    private WebDriver webDriver;

    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        // open My website
        webDriver.get("https://the-internet.herokuapp.com/");

        //1 - Maximize the window
        webDriver.manage().window().maximize();

        //2 - Fullscreen mode
        webDriver.manage().window().fullscreen();

        // Manage the window size
        webDriver.manage().window().setSize(new Dimension(340 , 740));

        System.out.println(webDriver.getTitle());

        // Find List of web elements
        List<WebElement> links = webDriver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Find single Web elements
        WebElement inputUsingText = webDriver.findElement(By.linkText("Inputs"));
        WebElement inputUsingSelector = webDriver.findElement(By.cssSelector("a[href=\"/inputs\"]"));
        WebElement inputUsingXpath = webDriver.findElement(By.xpath("//a[@href=\"/inputs\"]"));
        inputUsingXpath.click();

        // close my browser .close to close only the window
        webDriver.quit();

    }


    public static void main(String orgs[]) {
     FirstLesson baseTests = new FirstLesson();
     baseTests.SetUp();
    }
}

