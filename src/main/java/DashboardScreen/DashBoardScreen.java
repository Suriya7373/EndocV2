package DashboardScreen;
import DashboardScreen.DashBoardScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.naming.Name;
import java.time.Duration;
import static org.openqa.selenium.By.*;
public class DashBoardScreen {
    WebDriver driver;
    public DashBoardScreen(WebDriver driver) {

        this.driver = driver;
    }public void Screen()  {

        //Clicking on filter appointment button


        WebElement FilterToday = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        FilterToday.click();

        //Filtering today appointment
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement Today = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
         Today.click();

        //Filtering  Week  appointment
        WebElement Filterweek = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filterweek.click();
        WebElement Week = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[2]"));
        Week.click();

        //Filtering month appointment
        WebElement Filtermonth = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filtermonth.click();
        WebElement month = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[3]"));
        month.click();

        //Fliering yea appointment
        WebElement Filteryear = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filteryear.click();
        WebElement year = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[4]"));
        year.click();

        //Filtering custom range appointment
        WebElement customrange = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        customrange.click();

        WebElement custom = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[5]"));
        custom.click();


    //Patient years
        WebElement patinetyear = driver.findElement(xpath("//*[@id=\"mat-select-value-3\"]/span/span"));
        patinetyear.click();

        //Side notification
//        WebElement Notification = driver.findElement(xpath("//*[@class=\"notification-icon\"]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Notification);
//        Notification.click();

        //Side notification open encounter
//        WebElement Encounter = driver.findElement(xpath("//span[normalize-space()='Open encounters']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[1].click();", Encounter);
//        Encounter.click();























    }


}
