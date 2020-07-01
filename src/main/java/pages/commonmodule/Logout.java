package pages.commonmodule;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;
import java.util.List;

public class Logout extends BasePage {

    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//button[text()='UAT']/following::*//button/div/img")
    private WebElement avtaarIcon;

    @FindBy(how = How.XPATH, using = "    //span[text()='Logout']/parent::*/i")
    private WebElement logout;

    private Actions actions;
    
    public Logout(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
        actions = new Actions(driver);

    }

    @Step("Hover on UserName")
    public void doHoverOnUserName() {
        avtaarIcon.click();
//        actions.moveToElement(avtaarIcon).build().perform();
    }

    @Step("Submenu displayed")
    public boolean isSubMenuDisplayed() {
        return avtaarIcon.isDisplayed();
    }

    @Step("Logout")
    public void doLogout() {
        doHoverOnUserName();
        logout.click();
//        List<WebElement> userSubMenuList = logout.findElements(By.xpath("li/a"));

//        actions.moveToElement(logout).click().perform();
//        userSubMenuList.get(2).click();

    }

//    public void doLogout() {
//       webDriverWait.until(ExpectedConditions.elementToBeClickable(logout));
//        logout.click();
//    }
}
