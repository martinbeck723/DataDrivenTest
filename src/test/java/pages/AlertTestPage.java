package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertTestPage {
    WebDriver driver;

    // Locators
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");

    // Constructor
    public AlertTestPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickAlertButton() {
        driver.findElement(alertButton).click();
    }
}
