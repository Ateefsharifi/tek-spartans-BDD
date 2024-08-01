package tek.BDD.SetupStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.BDD.Utility.seleniumUtility;

public class SetUpStep extends seleniumUtility {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setUpDriver();
    }
    @Then("validate top left corner is TEKSchool")
    public void validateTopLeftLogo(){
        String txt=getText(By.xpath("//a[text()='TEKSCHOOL']"));
        System.out.println(txt);
        Assert.assertEquals("TEKSCHOOL",txt);
    }

    @Then("close the browser")
    public void closeTheBrowser(){
       quitBrowser();
    }


}
