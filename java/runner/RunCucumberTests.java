package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethods;

@CucumberOptions(features = "src/main/java/feature",
                 glue = {"stepDefinition", "hooks"},
                 tags = "@smoke",
                 monochrome =true,
                 publish = true)


public class RunCucumberTests extends ProjectSpecificMethods{

}
