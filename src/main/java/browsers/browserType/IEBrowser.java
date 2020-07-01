package browsers.browserType;

import browsers.DriverManagerWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Map;

public class IEBrowser extends DriverManagerWeb {
    private Capabilities capabilities;

    public IEBrowser() {
        WebDriverManager.iedriver().setup();
    }

    @Override
    protected void createDriver() {
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        webDriver = new InternetExplorerDriver(internetExplorerOptions);
        webDriver.manage().window().maximize();

        capabilities = ((RemoteWebDriver) webDriver).getCapabilities();
        System.out.println(((RemoteWebDriver) webDriver).getCapabilities() + " aaaaaaaaaaaaaaaaaaaa");
    }

    @Override
    protected void terminateDriver() {
        webDriver.quit();
        webDriver = null;
    }

    @Override
    protected String browserName() {
        return capabilities.getCapability("browserName").toString();
    }

    @Override
    protected String browserVersion() {
        return capabilities.getCapability("browserVersion").toString();
    }

    @Override
    protected String webDriverVersion() {
        return "ffffffffffff";
    }

}
