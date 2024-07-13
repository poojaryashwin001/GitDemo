import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ashw {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ashwin.poojari\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        String[] cart = {"Brocolli","Cauliflower", "Beetroot"};
        List a1 = Arrays.asList(cart);
        int j=0;
        for (int i = 0; i < products.size(); i++) {
            //System.out.println(cart[0]);
            String[] name = products.get(i).getText().split(" -");
            String formattedName=name[0].trim();


            if (a1.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
                j++;

            }
            if(j==a1.size()){
                break;
            }



        }
    }
}










