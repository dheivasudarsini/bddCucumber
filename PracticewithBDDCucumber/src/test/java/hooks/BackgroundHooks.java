package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundHooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("this will run before all the scenarios");
	}
	
	@After
	public void afterScenario() {
		System.out.println("this will run after all the scenarios");
	}

}
