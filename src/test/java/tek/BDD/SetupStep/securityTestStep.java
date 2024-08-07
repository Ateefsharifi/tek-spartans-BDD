package tek.BDD.SetupStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.BDD.Utility.seleniumUtility;
import tek.BDD.pages.HomePage;
import tek.BDD.pages.SignInPage;

public class securityTestStep extends seleniumUtility{
    @When("user click on sign in link")
    public void UserClickOnSignInBtn() {
        clickOnElement(HomePage.SING_IN_LINK);


    }
    @Then("validate user is in sign in page")
    public void ValidateUserInSignInPage() {
        String login=getText(By.className("login__subtitle"));
        Assert.assertEquals("Sign in",login);

    }
    @When("user enter \"Example@gmail.com\" and \"Test@12345\" then click on login")
    public void userEnterUserNameAndPassword(String userName, String password) {
        sendText(SignInPage.INPUT_EMAIL,userName);
        sendText(SignInPage.INPUT_PASSWORD,password);
    }
    @When("user enter username and password and click on login")
    public void user_enter_username_and_password_and_click_on_login() {
        sendText(SignInPage.INPUT_EMAIL,"Example@gmail.com");
        sendText(SignInPage.INPUT_PASSWORD,"Test@12345");
        clickOnElement(SignInPage.LOG_IN_BTN);

    }

    @Then("user should be able to see account link")
    public void UserSeeAccountCreationLink() {
    boolean AccountElement=isElementDisplayed(HomePage.ACCOUNT_LINK);
    Assert.assertTrue(AccountElement);

    }
}
