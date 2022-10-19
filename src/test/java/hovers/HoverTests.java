package hovers;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickOnHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        boolean isDisplayed = caption.isCaptionDisplayed();
        assertTrue("it is not displayed",isDisplayed);
        assertEquals("title is incorrect", "name: user1" , caption.getTitle() );
        assertEquals("link is incorrect", "https://the-internet.herokuapp.com/users/1" , caption.getLink());
        assertEquals("link text is incorrect", "View profile" , caption.getLinkText());
        assertTrue("link text is incorrect",caption.getLinkText().endsWith("/users/1"));
    }
}
