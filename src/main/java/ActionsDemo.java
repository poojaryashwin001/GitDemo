import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
        Actions a= new Actions(driver);

        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sneakers").build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();


        


    }
}
