Feature: Create new account in the SalesForce Application

@smoke
Scenario Outline: Create Account with different data
Given Login to the application
And Click on toggle menu button from the left corner
And Click View All 
And Click Sales from App Launcher
And Click on Accounts tab
And Click on New button in Accounts
When Enter Account name as <accountName>
And Select Ownership as Public
Then Click save and Verify Oppurtunity Name as <accountName>

Examples:
|accountName|
|Mythily|
|Satheesh|