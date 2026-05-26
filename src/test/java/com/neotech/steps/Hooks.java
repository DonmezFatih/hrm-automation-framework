package com.neotech.steps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@BeforeAll
	public static void init() throws IOException {
		Files.deleteIfExists(Paths.get("target/failed-tests.txt"));
	}

	@Before
	public void start() {
		setUp();
		loginPage.adminLogin();

		try {

			Files.deleteIfExists(Paths.get("target/failed-tests.txt"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public void end(Scenario scenario) {

		String status;

		if (scenario.isFailed()) {

			status = "failed";

			try {

				Files.write(Paths.get("target/failed-tests.txt"),

						(scenario.getName() + System.lineSeparator()).getBytes(),

						StandardOpenOption.CREATE, StandardOpenOption.APPEND);

			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {

			status = "passed";
		}

		String path = takeScreenshot(status, scenario.getName());

		try {

			byte[] screenshot = Files.readAllBytes(Paths.get(path));

			scenario.attach(screenshot, "image/png", scenario.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}

		tearDown();
	}

}
