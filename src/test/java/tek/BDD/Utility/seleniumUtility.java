package tek.BDD.Utility;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.BDD.Base.BaseSetup;

import java.time.Duration;

public class seleniumUtility extends BaseSetup {
    private  WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20));
    }
    private WebElement visibilityOfElement(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendText(By locator,String value){
        visibilityOfElement(locator).sendKeys(value);
    }
    public String getText(By locator){

        return visibilityOfElement(locator).getText();
    }
    public boolean isElementEnabled(By locator){
       return visibilityOfElement(locator).isEnabled();
    }
    public boolean isElementDisplayed(By locator){
        return visibilityOfElement(locator).isDisplayed();
    }


}
