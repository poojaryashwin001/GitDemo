package TestRun;

import Pageobjects.CartSection;
import Pageobjects.LandingPage;
import Pageobjects.loginpage;
import TestRun.TestComonents.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import java.util.*;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestRun.TestComonents.Listerners1.class)
public class ENDTOENDBASICTEST extends BaseTest {


@Test(dataProvider = "getData")
public void ENDTOENDBASIC(HashMap<String, String > map) throws InterruptedException, IOException {

//reports.createTest("Ashwin extent report ");



       // System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
       //WebDriver driver = new ChromeDriver();
       // driver.get("https://rahulshettyacademy.com/client");
        // driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
        // driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //loginpage e = new loginpage(driver);
        loginpage log1 = LaunchApplication();
        System.out.println(map.get("email") + map.get("password"));


        log1.login(map.get("email"), map.get("password"));

        //driver.findElement(By.id("login")).click();

        // List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
        LandingPage Land = new LandingPage(driver);
        List<WebElement> products = Land.getproductList();

        Land.AddToCartByname(map.get("product"));

        CartSection c = new CartSection(driver);
        c.AssertPrintCart("ZARA COAT 3");
        c.CheckoutSection("india");


        // WebElement product1 = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

        //product1.findElement(By.cssSelector("button.w-10")).click();


        // WebDriverWait w1= new WebDriverWait(driver,1000);

        //w1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#toast-container"))));

        //w1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));


        //driver.findElement(By.cssSelector("[routerlink*='cart']")).click();


        //List<WebElement> cart = driver.findElements(By.cssSelector(".infoWrap"));

        // WebElement e1 =cart.stream().filter(product-> product.findElement(By.cssSelector("h3")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

        //assertEquals(e1.findElement(By.cssSelector("h3")).getText(),"ZARA COAT 3");

        //System.out.println(e1.findElement(By.cssSelector("h3")).getText());


        //driver.findElement(By.cssSelector(".totalRow .btn")).click();


        // Actions a2 = new Actions(driver);
        //a2.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();
        //w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
        //driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

        //driver.findElement(By.cssSelector(".action__submit")).click();

        //
    //reports.flush();
    }

    public String takescreenshot(String testcaseName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File Source=ts.getScreenshotAs(OutputType.FILE);
        File Dest = new File("C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles"+ testcaseName+".png");
        FileUtils.copyFile(Source,Dest);
        return "C:\\Users\\ashwin.poojari\\IdeaProjects\\untitled15\\src\\test\\java\\DataFiles"+ testcaseName+".png";


    }

    @DataProvider
        public Object[][] getData() throws IOException {
        HashMap<String, String > map = new HashMap<String, String >();
        map.put("Mail","anshika@gmail.com");
        map.put("password","Iamking@000");
        map.put("product","ZARA COAT 3" );

        List<HashMap<String,String> > DataList = getJsonData();


        return new Object[][] { {DataList.get(0) },{DataList.get(1) }};
    }
}
