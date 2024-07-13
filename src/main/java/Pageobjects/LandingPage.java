package Pageobjects;

import AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage extends AbstractComponents {

    WebDriver driver;


    public LandingPage(WebDriver d) {
        super(d);
        this.driver=d;
        PageFactory.initElements(driver,this);

    }
    //List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

    //WebElement product1 = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

       // product1.findElement(By.cssSelector("button.w-10")).click();


        @FindBy(css=".mb-3")
         List<WebElement>  prod;

    By xpath2= By.xpath("(//div[@id='toast-container'])");

    By prod1 = By.cssSelector("b");

       By productsBY = By.cssSelector(".mb-3");
        By addToCart = By.cssSelector(".card-body button:last-of-type");
        By toastMessage = By.cssSelector("#toast-container");
//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

        @FindBy(css = "button.btn-custom .fa-shopping-cart")
        WebElement Cart;




        public  List<WebElement> getproductList(){
            //
            System.out.println("2346");
            waitForElementToAppear(productsBY);
            return prod;
        }

        public void AddToCartByname(String productName) throws InterruptedException {
            Thread.sleep(100);
            WebElement prod = getproductList().stream().filter(p->p.findElement(prod1).getText().equals(productName)).findFirst().orElse(null);
            System.out.println(prod.findElement(prod1).getText());
            prod.findElement(addToCart).click();

            waitForElementToAppear(toastMessage);
            Thread.sleep(1000);
            System.out.println("2345");
            Cart.click();


        }









}
