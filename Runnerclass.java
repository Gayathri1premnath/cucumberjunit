package cucumberjunit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\seleniumcucumbertrianing\\src\\test\\java\\cucumberjunit\\Login.feature"
,glue="Cucumber",plugin={"pretty","html:target/cucumber report.html"})
public class Runnerclass {

}
