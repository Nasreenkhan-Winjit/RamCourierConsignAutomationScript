package browsers.browserType;

import browsers.DriverManagerWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Map;

public class ChromeBrowser extends DriverManagerWeb {
    private Capabilities capabilities;
    public ChromeBrowser() {
        WebDriverManager.chromedriver().setup();
    }

    @Override
    protected void createDriver()  {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        chromeOptions.addArguments("start-maximized");
        webDriver = new ChromeDriver(chromeOptions);
        capabilities = ((RemoteWebDriver) webDriver).getCapabilities();
    }

    @Override
    protected void terminateDriver() {
        webDriver.quit();
        webDriver = null;
    }

    @Override
    protected String webDriverVersion() {
        Map<String, String> pref = (Map<String, String>) capabilities.getCapability("chrome");
        return pref.get("chromedriverVersion");
    }


    @Override
    protected String browserName(){
        return capabilities.getCapability("browserName").toString();
    }

    @Override
    protected String browserVersion(){
        return capabilities.getCapability("browserVersion").toString();
    }

}
