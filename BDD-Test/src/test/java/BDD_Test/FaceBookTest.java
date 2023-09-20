package BDD_Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"bdd/", "selenium/"},
        glue = "com.joydeep.definition",
        tags = { "@tag"},
        format = {"pretty", "html:target/cucumber"}
      )
public class FaceBookTest {
}
