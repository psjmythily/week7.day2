Feature: Create new dashboard in the SalesForce Application

@sanity
Scenario Outline: Create Dashboard with different data
Given Login to the application
And Click on toggle menu button from the left corner
And Click View All 
And Click Dashboards from App Launcher
And Click on the New Dashboard option 
When Enter name as <dashboardName>
And Click on Create
Then Verify Dashboard Name as <dashboardName>

Examples:
|dashboardName|
|Salesforce Automation by Mythily|
|Salesforce Automation by Sanmitha|