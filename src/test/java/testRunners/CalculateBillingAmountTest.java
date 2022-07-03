package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/app_features/CalculateBillingAmount.feature"},
			glue = {"steps"},
			plugin = {"pretty",
					  "json:target/MyReports/JSON/CalculateBillingAmount.json",
					  "junit:target/MyReports/XML/CalculateBillingAmount.xml",
					  "html:target/MyReports/HTML/CalculateBillingAmount.html"
					 }
		
		
		)
public class CalculateBillingAmountTest {

}
