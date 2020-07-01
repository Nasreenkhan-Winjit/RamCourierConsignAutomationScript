package pages.commonmodule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.Arrays;

public class Loader extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='spinner-inner']/parent::*/parent::div[contains(@class,'active')]")
    private WebElement elementLoader;

    public Loader(WebDriver webDriver) {
        super(webDriver);
    }

    public void waitForLoaderToDispose() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(convertWebElementToBy(elementLoader)));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(convertWebElementToBy(elementLoader)));
    }
}
