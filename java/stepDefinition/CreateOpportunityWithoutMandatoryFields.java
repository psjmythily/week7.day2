package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class CreateOpportunityWithoutMandatoryFields extends ProjectSpecificMethods{
	
	@Then("Verify the Alert message")
	public void verifyAlertMessage()
	{
		List<WebElement> message = driver.findElements(By.xpath("//div[text()='Complete this field.']"));
		for(int i=0;i<message.size();i++)
		{
			String text = message.get(i).getText();
			Assert.assertEquals(text, "Complete this field.");
		}
		System.out.println("Alert message is displayed");
		
		List<WebElement> errors = driver.findElements(By.xpath("//ul[@class='errorsList slds-list_dotted slds-m-left_medium']//a"));

		boolean name = false;
		boolean stage = false;

		for (WebElement eachError : errors) {
			String text = eachError.getText();
			if(text.equals("Opportunity Name"))
				name = true;
			else if(text.equals("Stage"))
				stage = true;
		}

		if (name&&stage==true)
			System.out.println("Alert message is dispalyed for Name and Stage");
		else
			System.out.println("Alert message is NOT dispalyed");
	}

}
