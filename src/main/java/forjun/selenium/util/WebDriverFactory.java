package forjun.selenium.util;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class WebDriverFactory {

    private WebDriver driver;

    public WebDriverFactory() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}

