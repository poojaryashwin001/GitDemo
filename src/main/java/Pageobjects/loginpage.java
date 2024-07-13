package Pageobjects;


import AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage  extends AbstractComponents {

    WebDriver driver;

    public loginpage(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(id="userEmail")
    WebElement usermail;
    @FindBy(id="userPassword")
            WebElement userpass;
    @FindBy(id="login")
         WebElement submit;
    @FindBy(css = "div[class *=flyInOut]")
    WebElement error;
    By CSS4 = By.cssSelector("div[class *=flyInOut]");


    public void login(String email,String password){
        usermail.sendKeys(email);
        userpass.sendKeys(password);
        submit.click();
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client");
    }
    public String returnerror(){
        waitForElementToAppear(CSS4);

        return error.getText();
    }






}
