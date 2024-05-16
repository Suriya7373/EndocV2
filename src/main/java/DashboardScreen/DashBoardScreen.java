package DashboardScreen;
import DashboardScreen.DashBoardScreen;
import org.openqa.selenium.WebElement;
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

        //Clicking on filter appointment button

        Thread.sleep (5000);
        WebElement FilterToday = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        FilterToday.click();

        //Filtering today appointment
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement Today = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
         Thread.sleep (5000);
         Today.click();

        //Filtering  Week  appointment
        WebElement Filterweek = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filterweek.click();
        Thread.sleep (5000);
        WebElement Week = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[2]"));
        Week.click();

        //Filtering month appointment
        WebElement Filtermonth = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filtermonth.click();
        Thread.sleep (5000);
        WebElement month = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[3]"));
        month.click();

        //Fliering yea appointment
        WebElement Filteryear = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        Filteryear.click();
        Thread.sleep (5000);
        WebElement year = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[4]"));
        year.click();

        //Filtering custom range appointment
        WebElement customrange = driver.findElement(xpath("//*[@class=\"mat-select-arrow ng-tns-c98-7\"]"));
        customrange.click();
        Thread.sleep (5000);
        WebElement custom = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[5]"));
        custom.click();

        //Clicking on appointment calender
        Thread.sleep (5000);
        WebElement calender = driver.findElement(xpath("(//*[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"])[3]"));
        calender.click();
        //(//*[@class="mat-focus-indicator mat-icon-button mat-button-base"])[3]



        //year of patinets
//        Thread.sleep (5000);
//        WebElement patinetyear = driver.findElement(xpath("//*[@id=\"mat-select-value-3\"]/span/span"));
//        Thread.sleep (5000);
//        patinetyear.click();

        //Appointment module
        Thread.sleep (8000);
        WebElement Appointment= driver.findElement(xpath("//div[contains(text(),'Appointments')]"]"));
        Appointment.click();

        //Appointment module  calender

        Thread.sleep (5000);
        WebElement Appointmentcalender= driver.findElement(xpath("//*[@id=\"dx-0a550cce-38b5-c365-8492-ec3b8f47861d\"][1]"));
        Appointmentcalender.click();

        //creat appointment

        Thread.sleep (5000);
        WebElement Areatappointment= driver.findElement(xpath("//*[@class=\"create-app ng-star-inserted\"][1]"));
        Areatappointment.click();

















    }


}
