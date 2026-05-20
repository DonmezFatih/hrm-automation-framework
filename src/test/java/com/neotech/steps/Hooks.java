package com.neotech.steps;

import java.nio.file.Files;
import java.nio.file.Paths;

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

		if (scenario.isFailed()) {

			String path = takeScreenshot(scenario.getName());

			try {
				byte[] screenshot = Files.readAllBytes(Paths.get(path));

				scenario.attach(screenshot, "image/png", scenario.getName());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		tearDown();
	}

}
