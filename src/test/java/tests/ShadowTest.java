package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AlertTestPage;
import pages.ShadowPage;
import utils.BaseTest;

import java.sql.SQLException;

import static org.testng.Assert.assertEquals;

public class ShadowTest extends BaseTest {

    @Test
    public void testLogin() throws SQLException {
        driver.get("https://the-internet.herokuapp.com/shadowdom");
        ShadowPage shadowPage = new ShadowPage(driver);

        String actual = shadowPage.getShadowDomText();
        //Verify
        assertEquals(actual, "My default text");

    }
}
