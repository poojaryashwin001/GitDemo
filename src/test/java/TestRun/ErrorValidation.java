package TestRun;

import Pageobjects.loginpage;
import TestRun.TestComonents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ErrorValidation extends BaseTest {


@Test

public void ENDTOENDBASIC() throws InterruptedException, IOException {

       // System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
       //WebDriver driver = new ChromeDriver();
       // driver.get("https://rahulshettyacademy.com/client");
        // driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
        // driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //loginpage e = new loginpage(driver);
        loginpage log1 = LaunchApplication();


        log1.login("anshika@gmail.com", "Iamking@0000");

        //driver.findElement(By.id("login")).click();

        System.out.println(log1.returnerror());
        Assert.assertEquals(log1.returnerror(),"Incorrect email or password.");



        //
    }

}
