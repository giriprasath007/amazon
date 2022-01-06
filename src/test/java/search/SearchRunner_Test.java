package search;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
glue= {"search"}, features= {"src\\test\\java\\search"}
		)

public class SearchRunner_Test {

}
