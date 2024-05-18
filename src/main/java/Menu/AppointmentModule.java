package Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;
import static org.openqa.selenium.By.xpath;
public class AppointmentModule {
    WebDriver driver;
    public AppointmentModule(WebDriver driver) {

        this.driver = driver;
    }
        public void Appointment() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


          //Appointment module

            WebElement  PatientAppointment = driver.findElement(xpath("//div[text()='Appointments']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PatientAppointment);
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //wait.until(ExpectedConditions.elementToBeClickable(PatientAppointment));
            PatientAppointment.click();

            //Appointment module  calender

            WebElement calendar= driver.findElement(xpath("(//*[@class=\"dx-button-content\"])[2]"));
            calendar.click();

           //filter week
            WebElement Week= driver.findElement(xpath("(//*[@class=\"dx-button-text\"])[3]"));
            Week.click();

            //filter month

            WebElement Month= driver.findElement(xpath("(//*[@class=\"dx-button-text\"])[4]"));
            Month.click();

            //Creat appointment

            WebElement Creatappointment= driver.findElement(xpath("//*[@class=\"create-app ng-star-inserted\"][1]"));
            Creatappointment.click();

            //Endering firstname
            Thread.sleep(3000);
            WebElement enteringFirstname = driver.findElement(id("mat-input-6"));
            enteringFirstname.sendKeys("Sg");
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//            wait.until(ExpectedConditions.elementToBeClickable(firstname));



//            WebElement Firstname= driver.findElement(id("mat-input-5"));
//            Firstname.sendKeys("Suriya");

            //Endering Lastname
            Thread.sleep(3000);
            WebElement EnteringLastname = driver.findElement(id("mat-input-8"));
            EnteringLastname.sendKeys("Suriya");

            //Choosing Gender

            WebElement Gender= driver.findElement(xpath("//*[@id=\"mat-select-value-5\"]"));
            Gender.click();

            //Choosing Gender Male

            WebElement GenderMale= driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
            GenderMale.click();

            //Choosing DOB

            WebElement DOB= driver.findElement(xpath("(//button[@aria-label=\"Open calendar\"])[1]"));
           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DOB);
            DOB.click();


            // //Choosing DOB today date

            WebElement DOBToday= driver.findElement(xpath("//td[@aria-label=\"May 20, 2024\"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" , DOBToday);
            DOBToday.click();
//            Thread.sleep(5000);
//            WebElement Today= driver.findElement(xpath("(//span[@class=\"mat-button-wrapper\"])[3]"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Today);
//            Today.click();













    }
}
