package tek.BDD.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/createNewAccount.feature",glue = "tek.BDD.SetupStep",dryRun = false)


public class runner {



}
