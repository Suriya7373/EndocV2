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
    public void Patienttracking(){
        WebElement Patienttracking = driver.findElement(xpath("//*[text()='Patient tracking']"));
        Patienttracking.click();

        //clicking on calender
        WebElement calender = driver.findElement(xpath("//button[@aria-label=\"Open calendar\"]"));
        calender.click();

    }
}
