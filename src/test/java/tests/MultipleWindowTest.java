package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DownloadPage;
import pages.MultipleWindowPage;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class MultipleWindowTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/windows");
        MultipleWindowPage multipleWindowPage = new MultipleWindowPage(driver);

        //click on multiple window
        multipleWindowPage.clickNewWindow();

        String mainWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }

        //verify text in new window
        String text = driver.findElement(By.xpath("//h3")).getText();
        assertEquals(text, "New Window");



        driver.switchTo().window(mainWindow);
        multipleWindowPage.clickNewWindow();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }
        driver.close();

        driver.switchTo().window(mainWindow);

    }
}
