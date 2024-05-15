package LoginAndRegisterScreen;//package LoginAndRegisterScreen;
import DashboardScreen.DashBoardScreen;
import org.checkerframework.checker.signature.qual.ClassGetName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.awt.SystemColor.menu;
import static org.openqa.selenium.By.*;
//import static org.openqa.selenium.by.classname;

   public class Login {

   public static WebDriver driver = new ChromeDriver();

   @Test

   public void Setup() throws InterruptedException {
       driver.get("https://mobtest.endocpm.com/login");
      driver.manage().window().maximize();

      //Enter user mailid

      WebElement enteringMailId = driver.findElement(id("mat-input-0"));
      enteringMailId.sendKeys("qasuriya@gmail.com");

       //Enter user password
        Thread.sleep (5000);
       WebElement enteringPassword = driver.findElement(id("mat-input-1"));
       enteringPassword.sendKeys("Endoc@123");

      //Clicking on signup

       WebElement ClickingSignup = driver.findElement(xpath("//span[normalize-space()='Sign In']"));
       Thread.sleep (5000);
       ClickingSignup.click();
       Thread.sleep (5000);

       //Clicking the profile button
        Thread.sleep (5000);
        WebElement Profile = driver.findElement(xpath("//div[@class='nav-right d-flex align-items-center']//div//div[@class='mat-menu-trigger UserProfilecls']"));
        Thread.sleep (5000);
        Profile.click();

      //Clicking on Logout button
       Thread.sleep (8000);
       WebElement Logout = driver.findElement(xpath("/html/body/div[2]/div[2]/div/div/div/button[2]"));
       Thread.sleep (3000);
       Logout.click();

//calling to dashborad page

       Thread.sleep (5000);
       driver.navigate().back();
        DashBoardScreen Screen = new DashBoardScreen(driver);
        Thread.sleep (5000);
        Screen.Screen ();

   }

   }
