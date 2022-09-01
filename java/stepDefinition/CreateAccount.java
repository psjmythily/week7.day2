package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends ProjectSpecificMethods{
	
	@And("Click on Accounts tab")
	public void clickAccountsTab()
	{
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", account);
	}
	
	@And("Click on New button in Accounts")
	public void clickNewButtonInAccounts()
	{
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}
	
	@When("Enter Account name as (.*)$")
	public void enterAccountName(String name)
	{
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	
	@And("Select Ownership as Public")
	public void selectOwnership() throws InterruptedException
	{
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
        driver.findElement(By.xpath("//span[@title='Public']")).click();
	}
	
	@Then("Click save and Verify Oppurtunity Name as (.*)$")
	public void clickSaveAndVerifyOpportunityName(String name)
	{
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        WebElement acc = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']"));
        String text = acc.getText();
        Assert.assertEquals(name, text);
        System.out.println("My Account name is verified");
	}
	

}
