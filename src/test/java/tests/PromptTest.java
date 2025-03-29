package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AlertTestPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class PromptTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        AlertTestPage alertTestPage = new AlertTestPage(driver);

        //JS confirm
        alertTestPage.clickPromptButton();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        assertEquals(text, "I am a JS prompt");
        alert.sendKeys("abc");
        //alert.dismiss();
        alert.accept();
        //JS Prompt

    }
}
