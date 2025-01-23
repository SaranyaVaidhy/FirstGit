package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\resources\\Featurs file"
		+ "\\Facebook.feature",glue = "org.setDef",
		
		plugin = "C:\\Users\\sheel\\eclipse-workspace\\Frasher\\target\\cucu.html")//packagename
public class TestRunner {
	
	//To run cucum feature and report gen

}
