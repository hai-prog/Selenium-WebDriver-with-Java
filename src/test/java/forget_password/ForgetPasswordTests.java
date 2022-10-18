package forget_password;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ForgetPasswordTests extends BaseTests {
    @Test
    public void testForgetPassword()
    {
        var forgetPassPage = homePage.clickForgetPassword();
        forgetPassPage.setEmail("haidyosama222");
        var retrievedData = forgetPassPage.clickRetrieveButton();
        assertEquals("the Retrieved data is incorrect","Internal Server Error" ,retrievedData.getmassage());

    }
}
