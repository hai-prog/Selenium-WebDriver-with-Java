package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert()
    {
        var alertsPage = homePage.clickOnJavaScriptAlerts();
        alertsPage.clickOnJsAlartButton();
        alertsPage.acceptAlert();
        assertEquals("Massage text is incorrect","You successfully clicked an alert", alertsPage.getMassage());
    }

    @Test
    public void testDismissAlert()
    {
        var alertsPage =homePage.clickOnJavaScriptAlerts();
        alertsPage.clickOnJsConfirmButton();
        assertEquals("Massage text is incorrect","I am a JS Confirm",alertsPage.getAlertText());
        alertsPage.cancelAlert();

    }

    @Test
    public void testSetMassageForAlert()
    {
        var alertsPage =homePage.clickOnJavaScriptAlerts();
        alertsPage.clickOnJsPromotButton();
        alertsPage.setAlertMassage("Hi I am Haidy!!");
        alertsPage.acceptAlert();
        assertEquals("Massage text is incorrect", "You entered: Hi I am Haidy!!",alertsPage.getMassage());
    }
}
