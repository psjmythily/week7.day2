Feature: Create new Opportunity without entering mandatory fields in the SalesForce Application

@smoke
Scenario: Create Opportunity without mandatory fields 
Given Login to the application
And Click on toggle menu button from the left corner
And Click View All 
And Click Sales from App Launcher
And Click on Opportunity tab
And Click on New button
When Choose close date as Today
And Click Save
Then Verify the Alert message
