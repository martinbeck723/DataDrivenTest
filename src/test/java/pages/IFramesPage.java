package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramesPage {
    WebDriver driver;

    // Locators
    private By popup = By.xpath("//div[contains(@class, 'tox-notifications-container')]");
    private By closeButton = By.xpath("//button[contains(@class, 'tox-button')]");


    // Constructor
    public IFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String popupGetText() {
        return driver.findElement(popup).getText();
    }

    public void clickClose(){ driver.findElement(closeButton).click();}
}
