package utilitiies;

import org.apache.hc.client5.http.async.methods.ConfigurableHttpRequest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private  Driver(){}


 private static WebDriver driver;

public  static  WebDriver getDriver(){

if(driver == null){
    switch (ConfigReader.getProperty("browser").toLowerCase()){
        default:
            driver=ChromeWebDriver.loadChromeDriver();
            break;
    }


}
return  driver;

}


}
