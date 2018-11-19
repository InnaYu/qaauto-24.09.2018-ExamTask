package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    public WebDriver webDriver;


    /** Method that  waits when webElement can be clickable or will end timeout
     * @param webElement - element on web page
     */
    public void waitUntilElementIsClickable(WebElement webElement){
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /** Method that  waits when webElement can be visible or will end timeout
     * @param webElement - element on web page
     * @param timeOutInSeconds - time out in seconds
     * @return visible webElement or exception  with timeout
     */
    public WebElement waitUntilElementIsVisible (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }

}
