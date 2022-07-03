package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/app_features/Uber.feature"},
			glue = {"steps"},
			tags = "@Smoke and @Regression",
			plugin = {"pretty"}
		
		)
public class UberBookingStepsTest {

}
