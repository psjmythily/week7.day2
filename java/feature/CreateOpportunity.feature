Feature: Create new Opportunity in the SalesForce Application

@smoke
Scenario Outline: Create Opportunity with different data
Given Login to the application
And Click on toggle menu button from the left corner
And Click View All 
And Click Sales from App Launcher
And Click on Opportunity tab
And Click on New button
When Enter Opportunity name as <opportunityName>
And Choose close date as Today
And Select Stage as Need Analysis
And Click Save
Then Verify Oppurtunity Name as <opportunityName>

Examples:
|opportunityName|
|Salesforce Automation by Mythily|
|Salesforce Automation by Sanmitha|