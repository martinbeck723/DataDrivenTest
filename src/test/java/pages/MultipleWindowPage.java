package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    WebDriver driver;

    // Locators
    private By downloadLink = By.xpath("//a[contains(text(), 'Click')]");


    // Constructor
    public MultipleWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickNewWindow() {
        driver.findElement(downloadLink).click();
    }
}
