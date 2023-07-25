package AccInfoRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		features = {"C:\\Users\\sambati\\eclipse-workspace\\AccountInformationCyclos\\src\\test\\resources\\Feature\\AccountInfo.feature"},
		glue= {"StepDefination"},
		dryRun = false,
		tags="@tag2",
		monochrome = true, 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" }
				)
		

public class AccInfoRunner1 extends AbstractTestNGCucumberTests{

}
