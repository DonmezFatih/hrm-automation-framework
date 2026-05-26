package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "@target/rerun.txt",
    glue = "com.neotech.steps",
    plugin = {
        "pretty",
        "html:target/failed-rerun-report.html",
        "json:target/rerun-cucumber.json"
    },
    monochrome = true
)

public class FailedRunner {
	
}
