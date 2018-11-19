package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{


    @FindBy(xpath = "//div[@class='FPdoLc VlcLAe']/center/input[@name='btnK']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchField;

    /** Constructor method that initialising the elements on SearchPage and wait that webElement can be clickable
     * @param webDriver - browser driver
     */
    public SearchPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        waitUntilElementIsClickable(searchButton);
    }


    /** Method that checks if the page is loaded
     * @return the true if all conditions are keep: the current link and Title contains the transmitted value
     */
    public boolean isPageLoaded(){
        return webDriver.getCurrentUrl().equals("https://www.google.com/")
               && webDriver.getTitle().contains("Google");
    }

    /** Method that enters searchTerm in searchField and clicks searchButton
     * @param searchTerm - String that contains searchTerm
     * @return FirstResultPage
     */
    public FirstResultPage search(String searchTerm){
        searchField.sendKeys(searchTerm);
        searchButton.click();
        return new FirstResultPage(webDriver);
    }






}
