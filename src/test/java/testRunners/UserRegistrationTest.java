package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/app_features/Registration.feature"},
			glue = {"steps"},
			plugin = {"pretty",
					  "json:target/MyReports/JSON/userRegistartion.json",
					  "junit:target/MyReports/XML/userRegistration.xml",
					  "html:target/MyReports/HTML/userRegistartion.html"
					 }
		
		
		
		)


public class UserRegistrationTest {

}
