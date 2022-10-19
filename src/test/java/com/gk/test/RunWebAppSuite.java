package com.gk.test;

import cucumber.runtime.model.CucumberFeature;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/main/resources/features/mobile/"},
		 //dryRun = true,
		 tags = {"@UserAbleToEnterTeamName"},
		monochrome = true, plugin = { "pretty", "html:target/cucumber-report/webapp",
				"json:target/cucumber-report/webapp/cucumber.json" }, glue = "com.gk.test.step_definitions.mobile")

public class RunWebAppSuite extends AbstractTestNGCucumberTests {


//	@Override
//	@DataProvider(parallel = true)	public Object[][] scenarios() {
//	//System.out.println(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("port"));
//	return super.scenarios();
//	}


}