package Runner;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\SM\\JAVA\\eclipse-java-2024-09-R-win32-x86_64\\Workspace\\mavenProj\\src\\test\\java\\Feature\\hello.feature",
		glue={"StepDefn"},
		//plugin= {"pretty","html:test-op"}
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runner {

}
