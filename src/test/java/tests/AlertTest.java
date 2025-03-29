package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AlertTestPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        AlertTestPage alertTestPage = new AlertTestPage(driver);

        //JS Alert
        alertTestPage.clickAlertButton();

        //Verify
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        assertEquals(text, "I am a JS Alert");


        alert.accept(); // Accept the alert

        //JS confirm

        //JS Prompt

    }
}
