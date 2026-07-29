Feature: SauceDemo Login

Scenario: Login with valid credentials

Given User launches browser
When User opens SauceDemo website
And User enters username "standard_user"
And User enters password "secret_sauce"
And User clicks Login button
Then User should be on Products page