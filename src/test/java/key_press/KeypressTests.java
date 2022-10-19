package key_press;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressPage;

import static org.testng.AssertJUnit.assertEquals;

public class KeypressTests extends BaseTests {

    @Test
    public void testBackSpaces()
    {   KeyPressPage keys = homePage.clickOnKeyPress();
        keys.setTextField("A" + Keys.BACK_SPACE);
        assertEquals("you enter incorrect txt","You entered: BACK_SPACE",keys.getText());
    }

    @Test
    public void testDollarSign()
    {   KeyPressPage keys = homePage.clickOnKeyPress();
        keys.enterDollarSign();
        assertEquals("you enter incorrect txt","You entered: 4", keys.getText());
    }
}
