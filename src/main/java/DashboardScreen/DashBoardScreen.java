package DashboardScreen;
import DashboardScreen.DashBoardScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.By.*;
public class DashBoardScreen {
    WebDriver driver;
    public DashBoardScreen(WebDriver driver) {

        this.driver = driver;
    }
    public void Screen() throws InterruptedException {

        driver.get("https://mobtest.endocpm.com/login");
        driver.manage().window().maximize();

        //Enter user mailid

        Thread.sleep (5000);
        WebElement enteringMailId = driver.findElement(id("mat-input-0"));
        enteringMailId.sendKeys("qasuriya@gmail.com");

        //Enter user password

        Thread.sleep (5000);
        WebElement enteringPassword = driver.findElement(id("mat-input-1"));
        enteringPassword.sendKeys("Endoc@123");

        //Clicking on signup
        Thread.sleep (3000);
        WebElement ClickingSignup = driver.findElement(xpath("//span[normalize-space()='Sign In']"));
        ClickingSignup.click();

        //Clicking on filter button -->Today
        Thread.sleep (3000);
        WebElement FilterToday = driver.findElement(xpath("(//*[@class=\"mat-select-arrow ng-tns-c98-70\"])[1]"));
        FilterToday.click();



    }


}
