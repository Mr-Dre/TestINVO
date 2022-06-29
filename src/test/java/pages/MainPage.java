package pages;

import helper.Helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiies.Driver;

public class MainPage extends Helpers {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "/html/body/div/div[2]/p[2]/a")
    public WebElement button;

    @FindBy(xpath = "/html/body/div/ul/li[2]/a")
    public  WebElement companies;

    @FindBy(xpath = "/html/body/div/ul/li[3]/a")
    public  WebElement product;

    @FindBy(xpath = "/html/body/div/ul/li[4]/a")
    public  WebElement productType;

    @FindBy(xpath = "/html/body/div/ul/li[5]/a")
    public  WebElement yourProfile;




}
