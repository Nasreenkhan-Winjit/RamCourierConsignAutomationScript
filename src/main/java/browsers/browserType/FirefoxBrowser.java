package browsers.browserType;

import browsers.DriverManagerWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowser extends DriverManagerWeb {
    private Capabilities capabilities;

    public FirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Override
    protected void createDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("start-maximized");
        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        webDriver =  new FirefoxDriver(firefoxOptions);
        capabilities = ((RemoteWebDriver) webDriver).getCapabilities();
        System.out.println(((RemoteWebDriver) webDriver).getCapabilities() + " ddddddddddddddddddddddddddddddddddd");
    }

    @Override
    protected void terminateDriver() {
        webDriver.quit();
        webDriver = null;
    }

    @Override
    protected String browserName(){
        return capabilities.getCapability("browserName").toString();
    }

    @Override
    protected String browserVersion(){
        return capabilities.getCapability("browserVersion").toString();
    }

    @Override
    protected String webDriverVersion(){
         return capabilities.getCapability("moz:geckodriverVersion").toString();
    }

}
