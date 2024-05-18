package Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
public class MypatientsModule {
    WebDriver driver;

    public MypatientsModule(WebDriver driver) {

        this.driver = driver;
    }
    public void Patients() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //Clicking on Mypatients

            WebElement MypatientsModule = driver.findElement(xpath("//*[text()='My Patients']"));
            MypatientsModule.click();

            //clicking on Add patient
            Thread.sleep(5000);
            WebElement Addpatient = driver.findElement(xpath("//*[text()='+ Add patient']"));
            Addpatient.click();

            //Endering first name
            Thread.sleep(3000);
            WebElement Enderingfirstname = driver.findElement(id("mat-input-4"));
            Enderingfirstname.sendKeys("Rio");

            //Endering Last name
            Thread.sleep(3000);
            WebElement EnderingLastname = driver.findElement(id("mat-input-6"));
            EnderingLastname.sendKeys("Ronald");

            //Choosing Gender
            Thread.sleep(3000);
            WebElement ChoosingGender = driver.findElement(id("mat-select-value-7"));
            ChoosingGender.click();

            //Choosing GenderMale
            Thread.sleep(3000);
            WebElement GenderMale = driver.findElement(xpath("//*[text()='Male']"));
            GenderMale.click();

            //Coosing DOB
            Thread.sleep(3000);
            WebElement DOB = driver.findElement(id("mat-input-9"));
            DOB.sendKeys("10/06/1999");

            //Entering mobilenumber
            Thread.sleep(3000);
            WebElement mobilenumber = driver.findElement(id("mat-input-11"));
            mobilenumber.sendKeys("7373871954");

            //Entering email
            Thread.sleep(3000);
            WebElement email = driver.findElement(id("mat-input-14"));
            email.sendKeys(("john@gmail.com"));

            //clicking nextbutton
            WebElement nextbutton = driver.findElement(By.className("pi-btnGroup"));
            nextbutton.click();

            //Entering Streetaddress
            Thread.sleep(3000);
            WebElement Streetaddress = driver.findElement(id("mat-input-16"));
            Streetaddress.sendKeys((" 2097 Lake Forest Drive"));

            //Entering Zipcode
            Thread.sleep(3000);
            WebElement Zipcode = driver.findElement(id("mat-input-18"));
            Zipcode.sendKeys(("630561"));


            //Entering City
            Thread.sleep(3000);
            WebElement City = driver.findElement(id("mat-input-19"));
            City.sendKeys(("630561"));

            //Entering state
            Thread.sleep(3000);
            WebElement state = driver.findElement(id("mat-input-20"));
            state.sendKeys(("630561"));

            //Clicking on Nextbutton
            Thread.sleep(2000);
            WebElement Nextbutton = driver.findElement(xpath("//*[text()='Next']"));
            Nextbutton.click();

            //Emergency contact firstname
            Thread.sleep(2000);
            WebElement Emergencyfirstname = driver.findElement(id("mat-input-28"));
            Emergencyfirstname.sendKeys("John");

            //Emergency contact Lastname
            Thread.sleep(2000);
            WebElement EmergencyLastname = driver.findElement(id("mat-input-29"));
            EmergencyLastname.sendKeys("Rio");

            //Emergency contact Phon

            Thread.sleep(2000);
            WebElement EmergencyPhon = driver.findElement(id("mat-input-30"));
            EmergencyPhon.sendKeys("7373871900");

            //Emergency contact Next
            Thread.sleep(2000);
            WebElement EmergencyNextbutton = driver.findElement(xpath("//*[text()='Next']"));
            EmergencyNextbutton.click();

            //Emergency Relation to guarantor
            Thread.sleep(3000);
            WebElement RelationtoguarantorCheckbox = driver.findElement(id("mat-checkbox-2"));
            RelationtoguarantorCheckbox.click();

            //clicking on save button

            Thread.sleep(8000);
            WebElement save = driver.findElement(xpath("//*[@class=\"pi-btnGroup\"]"));
            save.click();


        }


    }


