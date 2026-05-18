package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods{

	@Before
	public void start() {
		setUp();
		loginPage.adminLogin();
	}
	
	@After
	public void end() {
		tearDown();
	}
	
}
