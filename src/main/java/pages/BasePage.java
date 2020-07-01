package pages;

import com.google.inject.internal.cglib.proxy.$Dispatcher;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;

    public BasePage() {

    }

    protected BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        webDriverWait = new WebDriverWait(driver, 40);
        actions = new Actions(webDriver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40), this);
    }

    @Step("Enter webelement {0} value {0}")
    protected WebElement clearAndInputText(WebElement webElement, String inputTxt) {
        webElement.clear();
        webElement.sendKeys(inputTxt);
        return webElement;
    }


    protected By convertWebElementToBy(WebElement webElement) {

        String[] data = webElement.toString().split(" -> ")[1].replaceFirst(".$", "").split(": ");

        String locatorType = data[0];
        System.out.println(locatorType + " locatorType");
        String locatorPath = data[1];
        System.out.println(locatorPath + " locatorPath");

        switch (locatorType.toLowerCase()) {
            case "xpath":
                return By.xpath(locatorPath);
            default:
                System.out.println("Found locator \"" + locatorType + "\" is not handled.");
        }
        return (By) webElement;
    }

    public void scrollToElement( WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", webElement);
    }
}
