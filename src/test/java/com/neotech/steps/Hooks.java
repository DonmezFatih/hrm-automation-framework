package com.neotech.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@Before
	public void start() {
		setUp();
		loginPage.adminLogin();
	}

	@After
	public void end(Scenario scenario) {
		
        System.out.println("HOOK RUN: " + scenario.getName());

	    try {
	        if (scenario.isFailed()) {
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        tearDown();
	    }
	}

}
