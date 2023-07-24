package AccInfoRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\sambati\\eclipse-workspace\\AccountInformationCyclos\\src\\test\\resources\\Feature\\AccountInfo.feature"},
		glue= {"StepDefination"}
		
		)

public class AccInfoRunner1 {

}
