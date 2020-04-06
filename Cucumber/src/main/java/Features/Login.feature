Feature: free crm login feature

@SmokeTest1
Scenario: free crm login test scenario

Given User is already on login page  
When title of login page is Facebook – log in or sign up
Then enters username and password
Then click on Login button
Then user is on home page
