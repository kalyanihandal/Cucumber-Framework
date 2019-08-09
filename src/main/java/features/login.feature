Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user clicks on Login profile
#Then user enters "kalyanihandal28@gmail.com" and "Kalluuu77"
#Then user clicks on Login button
#And user is on home page


Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user clicks on Login profile
Then user enters "<username>" and "<password>"
Then user clicks on Login button
And user is on home page

Examples:

		|username|password|
		|kalyanihandal28@gmail.com|Kalluuu77|
		|kalluuu|test123|