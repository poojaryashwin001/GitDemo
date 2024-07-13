import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;


import Pageobjects.CartSection;
import Pageobjects.LandingPage;
import Pageobjects.loginpage;

public class ENDTOENDBASIC  {
    public static void main(String[] args) throws InterruptedException {


         System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/client");
       // driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
       // driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        loginpage e =new loginpage(driver);
        Thread.sleep(3000);
        e.goTo();
        e.login("anshika@gmail.com","Iamking@000");

        //driver.findElement(By.id("login")).click();

       // List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
        LandingPage Land = new LandingPage(driver);
       // List<WebElement> products = Land.getproductList();
        Land.AddToCartByname("ZARA COAT 3");

        CartSection c= new CartSection(driver);
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

        //driver.close();














    }

}
