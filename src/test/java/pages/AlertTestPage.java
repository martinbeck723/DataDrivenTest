package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertTestPage {
    WebDriver driver;

    // Locators
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//li/button[text()='Click for JS Prompt']");

    // Constructor
    public AlertTestPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickAlertButton() {
        driver.findElement(alertButton).click();
    }

    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }

    public void clickPromptButton() {
        driver.findElement(promptButton).click();
    }
}
