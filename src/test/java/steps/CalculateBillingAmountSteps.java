package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class CalculateBillingAmountSteps {
	
	
	double billAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {
	    
	}

	@When("User enters the billing amount {string}")
	public void user_enters_the_billing_amount(String billAMount) {
	    this.billAmount = Double.parseDouble(billAMount);
	}

	@When("User enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
	   this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("User clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	    
	}

	@Then("It gives the final amount {string}")
	public void it_gives_the_final_amount(String expectedFinalAmount) {
	    this.finalAmount = this.billAmount + this.taxAmount;
	    System.out.println("Expected final Amount: " + Double.parseDouble(expectedFinalAmount));
	    System.out.println("Actual fianl amount: " + this.finalAmount);
	    Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedFinalAmount));
	  
	}

	

}
