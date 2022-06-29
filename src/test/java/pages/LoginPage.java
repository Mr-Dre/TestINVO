package pages;

import helper.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiies.Driver;

public class LoginPage extends Helpers {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div[1]/nav/ul/li[4]/a")
    public WebElement business;


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/header/div/a")
    public WebElement signInToSystem;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/section/div[3]/div/div[2]/form/div[1]/input")
    public  WebElement email;


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/section/div[3]/div/div[2]/form/div[2]/input")
    public WebElement name;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/section/div[3]/div/div[2]/form/div[3]/div/input")
    public  WebElement password;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/section/div[3]/div/div[2]/form/button")
    public  WebElement button;


 public  void  sign(String userEmail, String userName, String userPassword){
    email.sendKeys(userEmail);
    name.sendKeys(userName);
    password.sendKeys(userPassword);
 }

    public void clickBusiness(WebElement element) {
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        business.click();
 }


}
