package LoginTests;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginInTest(){
        loginPage.clickLoginLink();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLogin();
    }
}
