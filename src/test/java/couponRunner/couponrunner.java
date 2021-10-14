package couponRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/couponfeature"
		,glue={"couponDefination","couponMethod"},
		dryRun=false,
		monochrome=true,
		plugin={"pretty","html:target/cucumber-pretty","junit:target/cucumber.xml","json:target/cucumber.json"}
)
	
public class couponrunner {

}
