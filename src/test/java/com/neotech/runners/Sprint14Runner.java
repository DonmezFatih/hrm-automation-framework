package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",

		glue = "com.neotech.steps",

		dryRun = false,

		monochrome = true,

		tags = "@Sprint-14")

public class Sprint14Runner {

}