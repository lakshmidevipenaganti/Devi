package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ={"src/test/resources/Features/HomeLoans2.feature"},
		glue={"HomeLoanspage2_stepdefinitions","apphooks"}
)
public class HomeLoans2testRunner extends AbstractTestNGCucumberTests{
	
}
