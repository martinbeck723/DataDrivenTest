package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.DownloadPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class DownloadTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/download");
        DownloadPage downloadPage = new DownloadPage(driver);

        //download
        downloadPage.clickDownloadButton();


    }
}
