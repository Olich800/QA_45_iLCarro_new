package tests;

import dto.UserDtoLombokLogin;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.SearchPage;

public class LoginTests extends ApplicationManager {
    LoginPage loginPage;

    @Test
    public void loginPage() {
        UserDtoLombokLogin user = UserDtoLombokLogin.builder()
                .login("bob_mail@mail.com")
                .password("Pass123!")
                .build();
        new SearchPage(getDriver()).clickBtnLogin();
        loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm(user);
        loginPage.clickBtnYalla();
        Assert.assertTrue(loginPage.isPopUpMessagePresent());

    }

}







