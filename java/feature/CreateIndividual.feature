Feature: Create new individual in the SalesForce Application

@functional
Scenario Outline: Create individuals with different data
Given Login to the application
And Click on toggle menu button from the left corner
And Click View All 
And Click Individuals  from App Launcher
And Click on the Dropdown icon in the Individuals tab
And Click on New Individual 
When Enter the Last Name as <lastName>
Then Click Save and Verify Individuals Name as <lastName>

Examples:
|lastName|
|Kumar|
|Manickam|