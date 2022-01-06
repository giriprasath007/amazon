package search;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Common_methods;

public class SearchItem_stepdefintion extends SearchItem_objects{
	
	Common_methods com = new Common_methods();

	@Given("browser lands on amazon home page")
	public void browser_lands_on_amazon_home_page() throws IOException {
	    com.launchbrowser();
	    String title = com.driver.getTitle();
	    if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
	    	System.out.println("Browser landed in Amazon Homepage");
	    }
	}

	@When("user enters {string} in searchbox")
	public void user_enters_in_searchbox(String string) {
		com.sendtextinput(searchbox, string);
	
	   
	}

	@When("click search button")
	public void click_search_button() {
		com.clickElement(searchbtn);
	}

	@Then("search results appear")
	public void search_results_appear() {
	  String title = com.driver.getTitle();
	  if (title.equals("Amazon.in : Samsung Galaxy Z fold3")) {
		  System.out.println("Search page loaded correctly");
	  }
	}

	@When("user clicks first option from the results")
	public void user_clicks_first_option_from_the_results() {
	   System.out.println("pending");
	}

	@Then("browser lands on product page")
	public void browser_lands_on_product_page() {
	    System.out.println("pending");
}
}
