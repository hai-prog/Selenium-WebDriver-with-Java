package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void testTextArea()
    {
        var framePage = homePage.clickOnWYSIWYGEditor();
        framePage.clearTextArea();
        framePage.setTextArea("Hello World!!");
        framePage.clickOnincreaseIndentButton();
        assertEquals("thetext is incorrect", "Hello World!!",framePage.getTextArea());
    }
}
