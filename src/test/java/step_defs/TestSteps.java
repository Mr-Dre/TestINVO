package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pojo.LoginDate;
import utilitiies.Driver;

import java.util.List;

public class TestSteps {


    WebDriver driver= Driver.getDriver();
    LoginPage login= new LoginPage();


    @Given("^Пользователь должен зайти на сайт flipboard\\.com$")
    public void пользователь_должен_зайти_на_сайт_flipboard_com() {
        driver.navigate().to("https://flipboard.com/");
    }

    @Given("^Заголовок сайта должен быть \"([^\"]*)\"$")
    public void заголовок_сайта_должен_быть(String title) {
        String actualResult="УЗНАТЬ ВДОХНОВИТЬСЯ";
        Assert.assertEquals(title,actualResult);
    }

    @Given("^Пользователь должен нажать на кнопку бизнес$")
    public void пользователь_должен_нажать_на_кнопку_бизнес() {
        login.clickBusiness(login.business);

    }

    @Given("^Пользователь должен увидеть ленту новостей$")
    public void пользователь_должен_увидеть_ленту_новостей() {
            Helpers.scrollDawn(login.signInToSystem);

    }

    @When("^Пользователь должен нажать на кнопку регистрация$")
    public void пользователь_должен_нажать_на_кнопку_регистрация() {
         Helpers.mouseClick(login.signInToSystem);

    }

    @When("^Пользователь должен вести эти данные$")
    public void пользователь_должен_вести_эти_данные(List <LoginDate> loginContainer ) {
        login.sign(loginContainer.get(0).getEmail(),loginContainer.get(0).getName(),loginContainer.get(0).getPassword());

    }
    @Then("^Пользователь должен успешно зарегистрироваться в системе$")
    public void пользователь_должен_успешно_зарегистрироваться_в_системе() {

    }





}
