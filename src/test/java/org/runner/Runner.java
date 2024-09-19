package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\src\\test\\resources\\Feature Files",
		glue = "org.stepdefinition",
		tags = "@Imdb",
		dryRun = false,
		strict = true,
		plugin = {"html:C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\All Reports\\html",
				"json:C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\All Reports\\Json\\imdb.json",
				"junit:C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\All Reports\\Junit\\imdb.junit",
				"rerun:C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\Failed\\fail.txt"
				})
public class Runner {
	
	
	@AfterClass
	public static void aft1() {
		
		JvmReport.generateReport("C:\\Users\\sheik althaf hussain\\eclipse-workspace\\AlthafMaven\\Cucumber1809\\All Reports\\Json\\imdb.json");
		
	}

}
