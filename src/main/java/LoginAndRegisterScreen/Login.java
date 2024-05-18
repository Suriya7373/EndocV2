package LoginAndRegisterScreen;//package LoginAndRegisterScreen;
import Menu.MypatientsModule;
import Pageobjectmodule.LoginpagePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

   public class Login {
       //new one

       public static WebDriver driver = new ChromeDriver();
        @Test
       public void Setup() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       driver.get("https://mobtest.endocpm.com/login");
       driver.manage().window().maximize();

      //Enter username

       //LoginpagePOM loginpagePOM=new LoginpagePOM();
       LoginpagePOM.username(driver).sendKeys("qasuriya@gmail.com");
       //Entering  password
       LoginpagePOM.Password(driver).sendKeys("Endoc@123");
       //Enter signup
       LoginpagePOM.Signin(driver).click();


       //calling to dashborad page
//
//       DashBoardScreen Screen = new DashBoardScreen(driver);
//
//        Screen.Screen ();
//
//        //calling to Appointment page
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//       AppointmentModule Appointment= new AppointmentModule(driver);
//       Appointment.Appointment();

       //calling to Patienttracking

//       PatienttrackingModule Patienttracking= new PatienttrackingModule(driver);
//       Patienttracking.Patienttracking();

       //calling to MypatientsModule
            Thread.sleep(3000);
            MypatientsModule Patients= new MypatientsModule(driver);
            Patients.Patients();

   }

   }
