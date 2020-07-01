package browsers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManagerWeb {

    protected WebDriver webDriver;
    protected abstract void createDriver() ;
    protected abstract void terminateDriver();
    protected abstract String browserName();
    protected abstract String browserVersion();
    protected abstract String webDriverVersion();

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            createDriver();
        }
        return webDriver;
    }

    public void quitDriver()   {
        if (null != webDriver) {
            terminateDriver();
        }
    }

    public String getBrowserName() {
        return browserName();
    }

    public String getBrowserVersion() {
        return browserVersion();
    }
    public String getWebDriverVersion(){
        return webDriverVersion();
    }
}
