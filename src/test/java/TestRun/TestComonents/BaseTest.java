package TestRun.TestComonents;
import Pageobjects.loginpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;


public class BaseTest {
    public static WebDriver driver;


    public static WebDriver initializeDriver() throws IOException {



        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\main\\java\\resources\\GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if(browserName.contains("chrome"))
        {
            System.out.println(browserName);
            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (6)\\\\chromedriver-win64\\\\chromedriver.exe");
             driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait());
            //chrome driver
            driver.manage().window().maximize();
            System.out.println(browserName);
        }
        return driver;
        
    }
    @BeforeMethod
    public loginpage LaunchApplication() throws IOException, InterruptedException {
        driver = initializeDriver();
        loginpage log = new loginpage(driver);
        log.goTo();
        Thread.sleep(1000);
        return log;

    }





    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    public List<HashMap<String, String>> getJsonData() throws IOException {
        String jsonfilestring = FileUtils.readFileToString(new File("C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles\\HashmapFile.json"), StandardCharsets.UTF_8);

        // Add jackson bind to pom.xml
        //then use ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String,String>> List = mapper.readValue(jsonfilestring, new TypeReference<java.util.List<HashMap<String, String>>>() {
        });
        return List;
    }



}
