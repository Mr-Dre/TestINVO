package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPageINVO;
import pages.MainPage;
import pojo.LoginDateINVO;
import utilitiies.Driver;

import java.util.List;

public class Test1Steps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage= new MainPage();
    LoginPageINVO loginINVO= new LoginPageINVO();

    @Given("^Пользователь должен открыть сайт$")
    public void пользователь_должен_открыть_сайт()  {
        driver.navigate().to("https://qatrainee.growave.io/index/index");
       
    }

    @Given("^Пользователь должен нажать на кнопку try it for free$")
    public void пользователь_Должен_Нажать_НаКнопку_TryItForFree() {
        Helpers.mouseClick(mainPage.button);
    }

    @Given("^Пользователь должен авторизоваться с этими данными$")
    public void пользователь_должен_авторизоваться_с_этими_данными(List <LoginDateINVO> loginData){
        loginINVO.singUp(loginData.get(0).getYourFullName(),loginData.get(0).getUserName(),loginData.get(0).geteMail(),
                loginData.get(0).getPassword(),loginData.get(0).getRepeatPassword());
    }

    @When("^Пользователь доложен успешно зайти в систему$")
    public void пользователь_доложен_успешно_зайти_в_систему()  {
        loginINVO.click(loginINVO.buttonRegister);
       
    }
    @When("^Система запросила  вести логин и пароль пользователь должен вести эти даные$")
    public void системаЗапросилаВестиЛогинИПарольПользовательДолженВестиЭтиДаные() {
        loginINVO.email.sendKeys("cifitej322@shbiso.com");
        loginINVO.password.sendKeys("test12345");
        loginINVO.buttonLogin.click();
    }

    @When("^Пользователь должен увидет  \"([^\"]*)\"$")
    public void пользователь_должен_увидет(String expectedTitle)  {
        String actualTitle ="Your Invoices";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("^Пользователь должен зайти в раздел companies$")
    public void пользователь_должен_зайти_в_раздел_companies()  {
        mainPage.companies.click();
       
    }

    @When("^Должен увидеть в разделе companies \"([^\"]*)\"$")
    public void должен_Увидеть_В_Разделе_Companies(String expectedTitle) {
        Assert.assertTrue(expectedTitle.contains("Search companies"));
    }


    @When("^Пользователь должен зайти в раздел products$")
    public void пользователь_должен_зайти_в_раздел_products()  {
        mainPage.product.click();
       
    }

    @When("^Пользователь должен зайти в раздел Product Type$")
    public void пользователь_должен_зайти_в_раздел_Product_Type()  {
        mainPage.productType.click();
    }

    @When("^Должен увидеть в разделе products \"([^\"]*)\"$")
    public void долженУвидетьВРазделеProducts(String expectedTitle) {
        Assert.assertTrue(expectedTitle.contains("Search products"));
    }

    @When("^Пользователь должен зайти в раздел Your profile$")
    public void пользователь_должен_зайти_в_раздел_Your_profile()  {
        mainPage.yourProfile.click();
       
    }

    @When("^Должен увидеть в разделе Product Type  \"([^\"]*)\"$")
    public void долженУвидетьВРазделеProductType(String expectedTitle) {
        Assert.assertTrue(expectedTitle.contains("Search product types"));
    }


    @Then("^Должен увидеть \"([^\"]*)\"  \"([^\"]*)\"$")
    public void должен_увидеть(String expectedTitle, String expectedTitle1)  {
        Assert.assertTrue(expectedTitle.contains("Your Full Name"));
        Assert.assertTrue(expectedTitle1.contains("Email Address"));
       
    }



}
