package tek.BDD.SetupStep;
import io.cucumber.java.After;
import tek.BDD.Utility.seleniumUtility;
import io.cucumber.java.Before;

public class HookSteps extends seleniumUtility{

    @Before
    public void beforeEachScenario(){
        setUpDriver();
    }

    @After
    public void afterEachScenario(){
        quitBrowser();
    }

}
