package skeleton;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoExample {
	
	Person A = new Person();
	Person B = new Person();
	
	@Given("A is {int}m away from B")
	public void a_is_m_away_from_B(Integer int1) {
	    A.setDistance(int1);
	}

	@When("A shouts {string}")
	public void a_shouts(String string) {
	    A.setMessage(string);
	}

	@Then("B listens to message")
	public void b_listens_to_message() {
	   String message = A.getMessage();
	   Assert.assertEquals(message, "Free Coffee");
	}
}
