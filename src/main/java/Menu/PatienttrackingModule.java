package Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.xpath;

public class PatienttrackingModule {
    WebDriver driver;
    public PatienttrackingModule(WebDriver driver) {

        this.driver = driver;
    }
    public void Patienttracking() throws InterruptedException {
        WebElement Patienttracking = driver.findElement(xpath("//*[text()='Patient tracking']"));
        Patienttracking.click();

        //clicking on calender
        Thread.sleep(5000);
        WebElement calender = driver.findElement(xpath("//*[name()='path' and contains(@d,'M19 3h-1V1')]"));
        calender.click();

        //clicking on calender today
        WebElement calendertoday = driver.findElement(xpath("//*[@class=\"mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today\"]"));
        calendertoday.click();


    }
}
