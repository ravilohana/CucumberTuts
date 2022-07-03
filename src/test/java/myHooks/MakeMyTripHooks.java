package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class MakeMyTripHooks {

	
	@Before(order=1)
	public void setUp_browser(Scenario sc) {
		System.out.println("Lauch the chrome browser");
		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void setUp_login_app() {
		System.out.println("login in make my trip website");
	}
	
	@Before(order=3)
	public void setUp_MaximizeBrowser() {
		System.out.println("Maximize the browser");
	}
	
	@After(order=1)
	public void tearDown_closeBrowser(Scenario sc) {
		System.out.println("quit the browser");
		System.out.println(sc.getName());
	}
	
	@After(order=2)
	public void tearDown_logout_mmpApp() {
		System.out.println("logout MMT App");
	}
	
	@After(order=3)
	public void tearDown_viewFlightDetails() {
		System.out.println("viewFlightDetails");
	}
	
	
	
	@BeforeStep
	public void takeScreenshot() {
		System.out.println("Take ScreenShot before every step defination");
	}
	
	@AfterStep
	public void refreshPage() {
		System.out.println("Refresh the page after every step defination");
	}
	
}
