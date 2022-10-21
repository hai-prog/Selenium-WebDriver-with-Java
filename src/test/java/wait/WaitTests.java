package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden()
    {
        var example1Page = homePage.clicOnDynamicLoading().clickOnExample1();
        example1Page.clickOnStartButton();
        assertEquals("the Text is incorrect" , "Hello World!" , example1Page.getText());
    }

    @Test
    public void testWaitUntilpresentce()
    {
        var example2Page = homePage.clicOnDynamicLoading().clickOnExample2();
        example2Page.clickOnStartButton();
        assertEquals("the Text is incorrect" , "Hello World!" , example2Page.getText());
    }
}
