package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FirstResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"nav\"]")
    private WebElement pageNavigationBar;

    @FindBy(xpath = "//*[@aria-label=\"Page 2\"]")
    private WebElement navigateToSecondPageButton;

    @FindBy(xpath = "//div[@class='g']")
    public List<WebElement> searchResultListFirstPage;


    /** Constructor method that initialising the elements on FirstResultPage and wait that webElement can be visible
     * @param webDriver - browser driver
     */
    public FirstResultPage (WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        waitUntilElementIsVisible(pageNavigationBar,5);

    }

    /** Method that checks if the page is loaded
     * @return the true if all conditions are keep: the current link and Title contains the transmitted value
     */
    public boolean isPageLoaded(){
        return webDriver.getCurrentUrl().contains("/search")
                && webDriver.getTitle().contains("- Пошук Google");
    }

    /** Method that return count of SearchResults
     * @return count of visible SearchResults
     */
    public int getSearchResultsCount() {

        return searchResultListFirstPage.size();
    }


    /** The method that checks contains Search Term in search Result StringList
     * @return Array searchResultStringList
     */
    public List getSearchResults() {

        List<String> searchResultStringList = new ArrayList<String>();

        for (WebElement searchResult: searchResultListFirstPage){

            String searchResultText= searchResult.getText();
            searchResultStringList.add(searchResultText);
        }
        return searchResultStringList;

    }

    /** Method that clicking on navigateToSecondPageButton
     * @return SecondResultPage
     */
    public SecondResultPage getNextPage(){
    navigateToSecondPageButton.click();
    return new SecondResultPage(webDriver);
    }

    public String getColorOfButton(){
        return navigateToSecondPageButton.getCssValue("background-color").toString();

    }



}
