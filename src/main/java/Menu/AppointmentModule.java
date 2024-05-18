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
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


          //Appointment module
            WebElement  PatientAppointment = driver.findElement(xpath("//*[text()='Appointments']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PatientAppointment);
            System.out.println("appointment1");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PatientAppointment);
            PatientAppointment.click();
            System.out.println("appointment2");

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
            DOB.click();

            // //Choosing DOB today date

            WebElement DOBToday= driver.findElement(xpath("//td[@aria-label=\"May 20, 2024\"]"));
            DOBToday.click();

            //Entering phonenumber

            Thread.sleep(3000);
            WebElement phonenumber = driver.findElement(xpath("//*[@id=\"mat-input-10\"]"));
            phonenumber.sendKeys("7373871966");

            //Entering e-mail

            Thread.sleep(3000);
            WebElement email = driver.findElement(xpath("//*[@id=\"mat-input-11\"]"));
            email.sendKeys("sgsuriya001@gmail.com");

            //Choosing  Facility dropdown

            Thread.sleep(3000);
            WebElement Facilitydropdown= driver.findElement(xpath("//*[@id=\"mat-select-value-7\"]"));
            Facilitydropdown.click();

            //Choosing  Facility

            Thread.sleep(5000);
            WebElement Facility= driver.findElement(xpath("//span[@class='mat-option-text']"));
            Facility.click();

            //Choosing physician
            Thread.sleep(3000);
            WebElement physiciandropdown= driver.findElement(xpath("//*[@id=\"mat-select-value-9\"]"));
            physiciandropdown.click();

            //Choosing physician

            Thread.sleep(5000);
            WebElement Facilityphysician= driver.findElement(xpath("//*[@class=\"mat-option-text\"]"));
            Facilityphysician.click();

            // //Choosing appointmentcalender
            Thread.sleep(5000);
            WebElement Appointmentcalender= driver.findElement(xpath("(//button[@aria-label=\"Open calendar\"])[2]"));
            Appointmentcalender.click();

            // //Choosing appointmenttoday date
            Thread.sleep(5000);
            WebElement  AppointmentToday= driver.findElement(xpath("//td[@aria-label=\"May 20, 2024\"]"));
            AppointmentToday.click();

            // //Choosing Appointmentcalender

            WebElement  Appointmentcalen= driver.findElement(xpath("//*[@id=\"mat-select-value-11"));
            Appointmentcalen.click();

            //Choosing Appointmentcalendertoday

            WebElement  Appointmentcalendertoday= driver.findElement(xpath("//*[@class=\"mat-option-text"));
            Appointmentcalendertoday.click();



























        }
}
