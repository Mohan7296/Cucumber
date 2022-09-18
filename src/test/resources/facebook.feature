Feature: Validate the facebook application

Scenario: Validation of facebook using invalid username and password

Given User must be navigate to the facebook url
When User enters the username and password
And User clicks on the login button
Then User validates the title after login


