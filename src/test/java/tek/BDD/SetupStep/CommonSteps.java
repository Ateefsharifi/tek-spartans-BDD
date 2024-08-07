package tek.BDD.SetupStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import tek.BDD.Utility.seleniumUtility;

public class CommonSteps extends seleniumUtility {

    @Given("user click on {string} link")
    public void userClickOnLinks(String linkText) {

        clickOnElement(By.linkText(linkText));

    }
    @When("user click on {string} button")
    public void user_click_on_button(String buttonVisibleText) {

        String buttonXpath="//button[text()='"+buttonVisibleText+"']";

        clickOnElement(By.xpath(buttonXpath));


    }

}
