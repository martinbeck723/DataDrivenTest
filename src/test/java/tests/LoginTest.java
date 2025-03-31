package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.IFramesPage;
import pages.LoginPage;
import utils.BaseTest;
import utils.Util;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws IOException, ParseException {

        LoginPage loginPage = new LoginPage(driver);

        JSONObject userObject = Util.loadJSONFiles("./src/test/resources/cred.json", 0);
        String username = userObject.get("username").toString();
        String password = userObject.get("password").toString();


        driver.get("https://the-internet.herokuapp.com/login");
        loginPage.enterCrendentials(username,password);
    }
}
