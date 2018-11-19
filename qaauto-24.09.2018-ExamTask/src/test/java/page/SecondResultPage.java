package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class SecondResultPage extends BasePage {

    @FindBy(xpath = "//div[@class='srg']/div[@class='g']")
    private List<WebElement> searchResultListSecondPage;

    @FindBy(xpath = "//*[@aria-label=\"Page 3\"]")
    private WebElement navigateToThirdPageButton;


    /** Constructor method that initialising the elements on SecondResultPage and wait that webElement can be clickable
     * @param webDriver - browser driver
     */
    public SecondResultPage (WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        waitUntilElementIsClickable(navigateToThirdPageButton);
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

        return searchResultListSecondPage.size();
    }

    /** The method that checks contains Search Term in search Result StringList
     * @return Array searchResultStringList
     */
    public List getSearchResults() {

        List<String> searchResultStringList = new ArrayList<String>();

        for (WebElement searchResult:searchResultListSecondPage){

            String searchResultText= searchResult.getText();
            searchResultStringList.add(searchResultText);
        }
        return searchResultStringList;

    }
}
