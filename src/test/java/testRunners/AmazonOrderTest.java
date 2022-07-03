package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/app_features/Order.feature"},
			glue = {"steps"},
			plugin = {"pretty"}
		
		)
public class AmazonOrderTest {

}
