package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\new eclipse pgm\\cucumber\\Resources\\feature\\ghome.feature", glue="stepDefinations")


public class TestRunner {

}
