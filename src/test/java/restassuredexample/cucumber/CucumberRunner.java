package restassuredexample.cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources"}
)
public class CucumberRunner {

}
