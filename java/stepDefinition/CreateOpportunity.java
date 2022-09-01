package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOpportunity extends ProjectSpecificMethods{
	
	@Given("Login to the application")
	public void login_to_the_application()
	{
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).click();
	}
	
	@And("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	
	@And("Click View All")
	public void click_view_all()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@And("Click Sales from App Launcher")
	public void clickSalesFromAppLauncher()
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@And("Click on Opportunity tab")
	public void clickOpportunityTab() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunity);
	}

	@And("Click on New button")
	public void clickNewButton()
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter Opportunity name as (.*)$")
	public void enterOpportunityName(String opportunityName) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityName);
		Thread.sleep(5000);
	}

	@And("Choose close date as Today")
	public void chooseCloseDate()
	{
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	}

	@And("Select Stage as Need Analysis")
	public void selectStage()
	{
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	
	@And("Click Save")
	public void clickSave()
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@Then("Verify Oppurtunity Name as (.*)$")
	public void verifyOpportunityName(String name)
	{
		String expectedName = driver.findElement(By.xpath("//lightning-formatted-text[text()='"+name+"']")).getText();
		Assert.assertEquals(name, expectedName);
		System.out.println("Opportunity name is verified");
		
	}

}

