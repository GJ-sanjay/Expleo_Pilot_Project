package org.runnerClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="C:\\Users\\pmurugesan\\Downloads\\Expleons_Proj\\Expleons_Proj\\src\\test\\resources\\FeatureFiles\\1_User_Functions\\UserFunction1.feature",
		glue={"org.stepDefinitionFirstModule"},
		dryRun=false,
		monochrome=true,
		 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		)			
		public class RunnerFile extends AbstractTestNGCucumberTests{

}
