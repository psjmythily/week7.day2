package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDefinition.ProjectSpecificMethods;

public class Hooks extends ProjectSpecificMethods{
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("This is before starting every step");
	}
	
	@AfterStep
	public void takesnap() throws IOException
	{
		System.out.println("Iam going to take a snap");
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("snap"+i+".png");
		FileUtils.copyFile(source, dest);
		i++;
	}

}
