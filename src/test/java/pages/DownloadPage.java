package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage {
    WebDriver driver;

    // Locators
    private By downloadLink = By.xpath("//a[contains(text(), 'selenium file')]");


    // Constructor
    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickDownloadButton() {
        driver.findElement(downloadLink).click();
    }
}
