package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver= driver;
    }

    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownListPage clickDropdown()
    {
        clickLink("Dropdown");
        return new DropdownListPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword()
    {
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public HoversPage clickOnHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressPage clickOnKeyPress()
    {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }
    public HorizontalSliderPage clickOnHorizontalSlider()
    {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlartsPage clickOnJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");
        return new AlartsPage(driver);
    }

    public FileUploadPage clickOnFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickOnContextMenu()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickOnWYSIWYGEditor()
    {
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public FramesPage clickOnFrames()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clicOnDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDOMPage clicOnLargeDeepDOM()
    {
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}
