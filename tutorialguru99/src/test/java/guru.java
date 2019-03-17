import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guru {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://demo.guru99.com/test/newtours/");


        String expectedTitle ="Welcome: Mercury Tours";
        String actualTitle = "";

        //driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!");
        }





      //driver.close();
//"http://demo.guru99.com/test/newtours/"
    }


}
