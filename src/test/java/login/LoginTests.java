package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setpassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clichLoginButton();

      assertEquals("login massage is incorrect", "You logged into a secure area!\n" +
              "×" , secureAreaPage.readLoginMassage());

    }
}
