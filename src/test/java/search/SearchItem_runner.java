package search;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Eclipse_Workspace\\shop.amazon\\src\\test\\java\\search\\searchitem.feature",
glue= "shop.amazon.search.SearchItem_stepdefinition",
plugin= {"pretty","html:taget/report"},
dryRun=true, // to check the unimplemented step in feature file before execution,
monochrome=true // display the console in proper readable format
		
		)

public class SearchItem_runner {

}
