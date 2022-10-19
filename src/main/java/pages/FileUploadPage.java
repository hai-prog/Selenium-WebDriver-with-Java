package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    private By fileName = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String absolutePath)
    {
        driver.findElement(chooseFile).sendKeys(absolutePath);
        clickOnUploadButton();
    }

    public void clickOnUploadButton()
    {
        driver.findElement(uploadButton).click();
    }

    public String getFileName()
    {
        return driver.findElement(fileName).getText();
    }
}
