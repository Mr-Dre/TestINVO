package pages;

import helper.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiies.Driver;

public class LoginPageINVO extends Helpers {

    public LoginPageINVO(){


        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div/form/fieldset/div[1]/div/input")
     public WebElement YourFullName;

    @FindBy(xpath = "/html/body/div/form/fieldset/div[2]/div/input")
     public WebElement Username ;

    @FindBy(xpath = "/html/body/div/form/fieldset/div[3]/div/input")
    public WebElement EMail ;

    @FindBy(xpath = "/html/body/div/form/fieldset/div[4]/div/input")
    public WebElement Password ;

    @FindBy(xpath = "/html/body/div/form/fieldset/div[5]/div/input")
    public WebElement RepeatPassword;

    @FindBy(xpath = "/html/body/div/form/fieldset/div[6]/input")
    public WebElement buttonRegister;


    @FindBy(id = "email")
    public WebElement email;


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/form/fieldset/div[3]/input")
    public  WebElement buttonLogin;

    public  void  singUp(String inputName,String  UserName, String inputEmail, String inputPassword, String inputRepeatPassword ){
        YourFullName.sendKeys(inputName);
        Username .sendKeys(UserName);
        EMail .sendKeys(inputEmail);
        Password .sendKeys(inputPassword);
        RepeatPassword.sendKeys(inputRepeatPassword);
    }

    public  void click(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        buttonRegister.click();
    }

}
