package first_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment1 {
    private WebDriver driver;

    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement link1 = driver.findElement(new By.ByLinkText("Shifting Content"));
        link1.click();

        WebElement lin2 = driver.findElement(By.cssSelector("a[href=\"/shifting_content/menu\"]"));
        lin2.click();

        List<WebElement> list = driver.findElements(By.tagName("li"));
        System.out.println(list.size());

        driver.quit();
    }

    public static void main(String orgs[]) {
        Assignment1 assignment1 = new Assignment1();
        assignment1.SetUp();
    }
}


