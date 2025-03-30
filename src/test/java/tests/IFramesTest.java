package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AlertTestPage;
import pages.IFramesPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class IFramesTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        IFramesPage iFramesPage = new IFramesPage(driver);


        String text = iFramesPage.popupGetText();
        assertEquals(text, "TinyMCE is in read-only mode because you have no more editor loads available this month.\n" +
                "Please request that the admin upgrade your plan\n" +
                "or add a valid payment method for additional editor load charges. Learn more.");

        iFramesPage.clickClose();
    }
}
