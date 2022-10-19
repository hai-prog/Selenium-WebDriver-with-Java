package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuAlertTests extends BaseTests {
    @Test
    public void testAlertTextOfContextMenu_page()
    {
        var contextMenuPage = homePage.clickOnContextMenu();
        contextMenuPage.clickOnTheBox();
        String txt = contextMenuPage.getAlertText();
        contextMenuPage.acceptTheAlert();
        assertEquals("the alter massage is incorrect","You selected a context menu",txt);
    }
}
