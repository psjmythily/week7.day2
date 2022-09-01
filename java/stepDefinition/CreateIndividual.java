package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIndividual extends ProjectSpecificMethods{

	@And("Click Individuals  from App Launcher")
	public void clickIndividuals()
	{
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(individual).perform();
		individual.click();
	}

	@And("Click on the Dropdown icon in the Individuals tab")
	public void clickDropdowniconInIndividualsTab()
	{
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']")).click();
	}

	@And("Click on New Individual")
	public void clickNewIndividual()
	{
		WebElement newIndividual = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", newIndividual);
	}
	
	@When("Enter the Last Name as (.*)$")
	public void enterLastName(String name)
	{
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(name);
	}
	
	@Then("Click Save and Verify Individuals Name as (.*)$")
	public void clickSaveandVerifyIndividualsName(String name)
	{
       driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String actualName = driver.findElement(By.xpath("//div[@title='"+name+"']")).getText();
		Assert.assertEquals(actualName, name);
		System.out.println("Individual name is verified");
	}


}
