package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.commonmodule.Login;

public class PageDashBoard extends BasePage{

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-right']")
    private WebElement elementNavBar;

    @CacheLookup
    @FindBy(how = How.XPATH, using="//ul[contains(@class,'v-expansion-panel')]/li[5]")
    private WebElement elementAvailableAccordion;

    @FindBy(how = How.XPATH,using = "//ul[contains(@class,'v-expansion-panel')]/li[5]/../..//label[normalize-space(text())='Consign']")
    private WebElement elementConsignAccordion;

    public PageDashBoard(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnNavBar() throws InterruptedException {
        System.out.println(elementNavBar);
        actions.moveToElement(elementNavBar).build().perform();
        elementNavBar.click();
    }

    public void clickOnConsignViaAccordion() throws InterruptedException {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementAvailableAccordion));
        elementAvailableAccordion.click();
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementConsignAccordion);
        scrollToElement(elementConsignAccordion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementConsignAccordion);
    }
}
