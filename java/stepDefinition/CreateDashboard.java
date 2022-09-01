package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateDashboard extends ProjectSpecificMethods {

	@And("Click Dashboards from App Launcher")
	public void clickDashboard() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(dashboard).perform();
		dashboard.click();
	}

	@And("Click on the New Dashboard option")
	public void clickOnTheNewDashboardOption()
	{
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	}

	@When("Enter name as (.*)$")
	public void enterName(String name)
	{
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys(name);
	}
	
	@And("Click on Create")
	public void clickOnCreate()
	{
		driver.findElement(By.id("submitBtn")).click();
	}
	
	@Then("Verify Dashboard Name as (.*)$")
	public void verifyDashboardName(String name) throws InterruptedException
	{
		Thread.sleep(5000);
        String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains(name))
		{
			System.out.println("Dashboard Name Verified");
		}
		else
		{
			System.out.println("Dashboard Name MIS-MATCH");
		}
	}

}
