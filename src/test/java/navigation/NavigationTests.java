package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator()
    {
        homePage.clicOnDynamicLoading().clickOnExample1();
        getWindowManager().goBack();
        getWindowManager().reloadPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testWindowTabs(){
        var newPage = homePage.clicOnDynamicLoading().rightclickOnExample2();
        getWindowManager().switchToNewTab();
        assertTrue(newPage.checkStartButtonVisiability(), "Start button is not displayed");
    }
}
