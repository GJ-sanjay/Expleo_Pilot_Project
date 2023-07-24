package org.runnerClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\sjayakumar\\eclipse-workspace\\Expleons_Proj\\src\\test\\resources\\FeatureFiles\\3_Payment_Module\\3.3_PaymentRequests.feature",//feature file path
glue={"org.stepDefinitionFirstModule"}
                  
)
public class RunnerFile {

}
