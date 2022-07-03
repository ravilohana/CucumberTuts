package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/app_features/MakeMyTrip.feature"},
			glue = {"steps" ,"myHooks"},
			plugin = {	"pretty",
						"json:target/MyReports/JSON/report.json",
						"junit:target/MyReports/XML/report.xml",
						"html:target/MyReports/HTML/report.html"
			
					 }
		
		)
public class MakeMyTripTest {

}
