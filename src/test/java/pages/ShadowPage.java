package pages;

import org.openqa.selenium.*;

import java.sql.SQLException;

import static java.sql.DriverManager.getDriver;


public class ShadowPage {
    WebDriver driver;

    // Locators
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//li/button[text()='Click for JS Prompt']");

    // Constructor
    public ShadowPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions

    public String getShadowDomText () throws SQLException {
        // Locate the shadow host
        WebElement shadowHost = driver.findElement(By.xpath("//*[@id=\"content\"]/my-paragraph[1]"));

        // Get shadow root using Selenium 4's getShadowRoot() method
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement shadowElement = shadowRoot.findElement(By.cssSelector("p slot"));
        return shadowElement.getText();
    }
}
