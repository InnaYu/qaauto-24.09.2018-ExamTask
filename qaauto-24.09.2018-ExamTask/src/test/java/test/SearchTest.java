package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.FirstResultPage;

import page.SecondResultPage;

import java.util.Collections;
import java.util.List;

public class SearchTest extends BaseTest {

    @DataProvider
    public Object[][] ValidDataProvider() {
        return new Object[][]{
                {"Selenium"},
                //{"SELENIUM"},
               // {"selenium"}
        };
    }

   @Test(dataProvider = "ValidDataProvider")
   public void basicSearchTest(String searchTerm){

       Assert.assertTrue(searchPage.isPageLoaded(),
               "Search Page page is not loaded.");

       FirstResultPage firstResultPage = searchPage.search(searchTerm);
       Assert.assertTrue(firstResultPage.isPageLoaded(),
               "FirstResultPage is not loaded.");


       Assert.assertEquals(firstResultPage.getSearchResultsCount(), 10,
               "SearchResults count is wrong");

       List<String> searchResultList = firstResultPage.getSearchResults();
       for (String searchResult : searchResultList){
           Assert.assertTrue(searchResult.toLowerCase().contains(searchTerm.toLowerCase()),
                   "SearchTerm" + searchTerm+"not found");
       }

       Assert.assertEquals(firstResultPage.getColorOfButton(),"rgb(0,0,255)",
               "color is not blue");

       /*


       SecondResultPage secondResultPage=firstResultPage.getNextPage();
       Assert.assertTrue(secondResultPage.isPageLoaded(),
               "FirstResultPage is not loaded.");

       Assert.assertEquals(secondResultPage.getSearchResultsCount(), 10,
              "SearchResults count is wrong");

       List<String> searchResultListSecondPage = secondResultPage.getSearchResults();
       for (String searchResult : searchResultList){
           Assert.assertTrue(searchResult.toLowerCase().contains(searchTerm.toLowerCase()),
                   "SearchTerm" + searchTerm+"not found");
       }
*/


   }

}
