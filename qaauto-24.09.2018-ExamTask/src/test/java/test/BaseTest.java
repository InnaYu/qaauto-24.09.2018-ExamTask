package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import page.SearchPage;

public class BaseTest {


    public WebDriver webDriver;
    SearchPage searchPage;


    @Parameters("browser")

    @BeforeMethod
    public void beforeMethod(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            webDriver = new FirefoxDriver();
            }else if (browser.equalsIgnoreCase("chrome")) {
            webDriver = new ChromeDriver();
            }
        webDriver.get("https://www.google.com");
        searchPage = new SearchPage(webDriver);
    }

    @AfterMethod
    public void afterMethod() {
        webDriver.quit();
    }
}
