package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("User Navigates to Registration page");
	}

	@When("User enters the following user deatils")
	public void user_enters_the_following_user_deatils(DataTable dataTable) {
	    List<List<String>>  userRegisterData= dataTable.asLists(String.class);
	    
	    for(List<String> userData: userRegisterData ) {
	    	System.out.println(userData);
	    }
	}
	
	@When("User enters the following user deatils  Columns")
	public void user_enters_the_following_user_deatils_columns(DataTable dataTable) {
	   List<Map<String,String>> userLists = dataTable.asMaps(String.class,String.class);
	   
	   System.out.println(userLists);
	   
	   for(Map<String,String> userList : userLists) {
		   System.out.println(userList.get("firstname") 
				   + "--->" + userList.get("lastname")
				   + "--->" + userList.get("email")
				   + "--->" + userList.get("phone_No")
				   + "--->" + userList.get("city")   
				   );
	   }
	}

	@Then("User registration should be successfull")
	public void user_registration_should_be_sucessfull() {
	    System.out.println("User registration is successfull");
	}


}
