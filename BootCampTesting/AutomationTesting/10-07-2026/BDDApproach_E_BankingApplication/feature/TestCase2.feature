Scenario: Test case 2: Verify Customer Login
Given User should open Chrome Browser
When User should enter the E-Banking application URL in browser
Then User should click on Login option
Then User should enter User ID "neeraj@test.com" into User ID/Customer ID field
Then User should enter Password "Neeraj@123" into Password field
Then User should click on Login button
Then User should verify Dashboard/Home page is displayed successfully
