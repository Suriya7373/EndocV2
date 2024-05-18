package LoginAndRegisterScreen;//package LoginAndRegisterScreen;
import DashboardScreen.DashBoardScreen;
//import Menu.Appointment;
import Menu.AppointmentModule;
import Menu.MypatientsModule;
import Menu.PatienttrackingModule;
import Pageobjectmodule.LoginpagePOM;
import org.openqa.selenium.JavascriptExecutor;
import org.checkerframework.checker.signature.qual.ClassGetName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import static java.awt.SystemColor.menu;
import static org.openqa.selenium.By.*;
//import static org.openqa.selenium.by.classname;
   public class Login {

   public static WebDriver driver = new ChromeDriver();

   @Test
     public void Setup() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://mobtest.endocpm.com/login");
       driver.manage().window().maximize();

      //Enter username password and signup for POM

       LoginpagePOM loginpagePOM=new LoginpagePOM();
       LoginpagePOM.username(driver).sendKeys("qasuriya@gmail.com");
       LoginpagePOM.Password(driver).sendKeys("Endoc@123");
       LoginpagePOM.Signin(driver).click();

















//      WebElement enteringMailId = driver.findElement(id("mat-input-0"));
//      enteringMailId.sendKeys("qasuriya@gmail.com");
//
//       //Enter user password
//
//       WebElement enteringPassword = driver.findElement(id("mat-input-1"));
//       enteringPassword.sendKeys("Endoc@123");
//
//      //Clicking on signup
//
//       WebElement ClickingSignup = driver.findElement(xpath("//span[normalize-space()='Sign In']"));
//       ClickingSignup.click();


       //calling to dashborad page

       DashBoardScreen Screen = new DashBoardScreen(driver);

        Screen.Screen ();

        //calling to Appointment page
       AppointmentModule Appointment= new AppointmentModule(driver);
       Appointment.Appointment();

       //calling to Patienttracking

       PatienttrackingModule Patienttracking= new PatienttrackingModule(driver);
       Patienttracking.Patienttracking();

       //calling to MypatientsModule
       MypatientsModule Patients= new MypatientsModule(driver);
       Patients.Patients();

   }

   }
