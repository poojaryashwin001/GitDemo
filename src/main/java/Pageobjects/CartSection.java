package Pageobjects;

import AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CartSection extends AbstractComponents {

    WebDriver driver;

    public CartSection(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = ".totalRow button")
    WebElement checkoutEle;
    @FindBy(css = ".infoWrap")
            List<WebElement> cart;
    //List<WebElement> cart = driver.findElements(By.cssSelector(".infoWrap"));
    @FindBy(css ="input[placeholder='Select Country']")
            WebElement country;
    @FindBy(xpath = "\"(//button[contains(@class,'ta-item')])[2]\"")
            WebElement xpath1;
    @FindBy(css = ".action__submit")
            WebElement submit ;
    @FindBy(css=".ng-star-inserted button:nth-child(3)")
            WebElement india;
    By CSS1 = By.cssSelector("h3");
    By CSS2 = By.cssSelector(".ta-results");





    public List<WebElement> ProductsaddedTOCart(){
        return cart;
    }

    public void AssertPrintCart(String assertValue) throws InterruptedException {
        System.out.println("123");
        Thread.sleep(1000);
        WebElement e = ProductsaddedTOCart().stream().filter(p->p.findElement(CSS1).getText().equals(assertValue)).findFirst().orElse(null);
        //assertEquals(assertValue,e.findElement(CSS1).getText());
        //System.out.println(e.findElement(CSS1).getText());
        checkoutEle.click();
        System.out.println("123");


    }

    public void CheckoutSection(String countryname){

        Actions a2 = new Actions(driver);
        a2.sendKeys(country, countryname).build().perform();
        waitForElementToAppear(CSS2);
        System.out.println("345");

        //w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

        //driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

        india.click();
        submit.click();


        //driver.findElement(By.cssSelector(".action__submit")).click();


    }


}
