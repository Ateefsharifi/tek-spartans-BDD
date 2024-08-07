package tek.BDD.SetupStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.BDD.Utility.RandomGenerator;
import tek.BDD.Utility.seleniumUtility;
import tek.BDD.pages.AccountPage;
import tek.BDD.pages.SignUpPage;

public class CreateNewAccountSteps extends seleniumUtility {
    private static String emailToUse;

    @When("user enter {string} and {string} and {string}")
    public void userEnterNewAccountInfo(String name, String email,String password) {
         emailToUse=email.equalsIgnoreCase("random") ? RandomGenerator.generateRandomEmail() : email;

        sendText(SignUpPage.Name_Input,name);
        sendText(SignUpPage.Email_Input,emailToUse);
        sendText(SignUpPage.Password_Input,password);
        sendText(SignUpPage.Confirm_Password,password);

    }
    @Then("validate user is in account page")
    public void validate_user_is_in_account_page() {
    String actualText=getText(AccountPage.Profile_Page_Title);
        Assert.assertEquals("Account page should contains your profile text","Your Profile",actualText);
    }

    @Then("validate email address in account page match")
    public void validateEmailAddressInAccountPage() {
    String actualEmail=getText(AccountPage.Profile_Email_text);
    Assert.assertEquals("Email in Account page should match with email used in create account page",emailToUse,actualEmail);


    }
    @Then("the user should see error {string}")
    public void the_user_should_see_error(String string) {


    }

}
