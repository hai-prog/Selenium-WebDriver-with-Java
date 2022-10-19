package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NestedFramesTests extends BaseTests {
    @Test
    public void textNestedFrames()
    {
        var nestedFramesPage = homePage.clickOnFrames().clickOnNestedFrames();
        String txt1 = nestedFramesPage.getTextOfBottomFrame();
        String txt2 = nestedFramesPage.getTextOfLeftFrame();
        assertEquals("the text is incorrect", "LEFT", txt2);
        assertEquals("the text is incorrect", "BOTTOM", txt1);

    }
}
