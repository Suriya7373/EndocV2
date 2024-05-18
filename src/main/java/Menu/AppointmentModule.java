package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.*;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class AppointmentModule {
    WebDriver driver;
    public AppointmentModule(WebDriver driver) {

        this.driver = driver;
    }
        public void Appointment()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

        //Appointment module
        WebElement Appointment = driver.findElement(xpath("//div[text()='Appointments']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Appointment);
        Appointment.click();

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


    }
}
