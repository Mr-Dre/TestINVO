package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitiies.Driver;

public class Helpers {



    public static void mouseClick(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();
    }

    public static void waitElementToBeDisplayed(WebElement element ){
        new WebDriverWait(Driver.getDriver(),10)
                .until(ExpectedConditions.visibilityOf(element));
 }

    public  static void waitForElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(),10)
                .until(ExpectedConditions.elementToBeClickable(element));
 }
   public  static  void scrollDawn(WebElement element){
       JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");

   }


}
