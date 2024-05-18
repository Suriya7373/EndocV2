package Pageobjectmodule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
public class LoginpagePOM {

    //Entering Username,Password, and clicking on Signin
    public static WebElement username(WebDriver driver) {
        return driver.findElement(id("mat-input-0"));
        //enteringMailId.sendKeys("qasuriya@gmail.com");

    }

    public static WebElement Password(WebDriver driver) {
        return driver.findElement(id("mat-input-1"));
        ////enteringPassword.sendKeys("Endoc@123");

    }

    public static WebElement Signin(WebDriver driver) {
        return driver.findElement(xpath("//span[normalize-space()='Sign In']"));
        //ClickingSignup.click();
    }


        //choosing facility
        public static WebElement organization (WebDriver driver){
            return driver.findElement(xpath("(//*[@class=\"p-3\"])[1]"));


        }
    //choosing organization

    public static WebElement facility    (WebDriver driver) {
        return driver.findElement(xpath("(//*[@class=\"p-3\"])[1]"));
    }

    }

