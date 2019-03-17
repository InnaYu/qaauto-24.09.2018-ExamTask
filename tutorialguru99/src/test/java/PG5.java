import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG5 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String allertMessage="";

        driver.get("http://jsbin.com/usidix/1");
        ((FirefoxDriver) driver).findElementByXPath("/html/body/input").click();
        allertMessage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(allertMessage);

    }
}
