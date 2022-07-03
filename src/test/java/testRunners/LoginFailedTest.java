package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/resources/app_features/Login.feature"},
			glue = {"steps"},
					plugin = {	"pretty",
							"json:target/MyReports/JSON/loginFailed.json",
							"junit:target/MyReports/XML/loginFailed.xml",
							"html:target/MyReports/HTML/loginFailed.html"
				
						 }	
		
		)
public class LoginFailedTest {

}
