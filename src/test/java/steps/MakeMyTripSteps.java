package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMyTripSteps {
	
	
	@Given("User must be login in make my trip app")
	public void user_must_be_login_in_make_my_trip_app() {
	    System.out.println("Login in Make my trip WebSite");
	}

	@When("click on flight link")
	public void click_on_flight_link() {
	  System.out.println("Click on Flight link");
	}

	@When("select on Round trip option")
	public void select_on_round_trip_option() {
	   System.out.println("Choose round trip");
	}

	@When("Slect From location {string}")
	public void slect_from_location(String fromLocation) {
	   System.out.println("From Location" + fromLocation);
	}

	@When("Select To location {string}")
	public void select_to_location(String toLocation) {
	   System.out.println("To Location" + toLocation);
	}

	@When("select departure date {string}")
	public void select_departure_date(String fromDate) {
	    System.out.println("Departure Date : " + fromDate);
	}

	@When("select  return date  {string}")
	public void select_return_date(String toDate) {
		System.out.println("Return Date: " + toDate);
	}

	@Then("click on Search button")
	public void click_on_search_button() {
	 System.out.println("Click on Search button");
	}

	@Then("slect the flight")
	public void slect_the_flight() {
	   System.out.println("Select flight of you choise");
	}

	@Then("Do the payments")
	public void do_the_payments() {
	    System.out.println("Payment Done!!");
	}

}
