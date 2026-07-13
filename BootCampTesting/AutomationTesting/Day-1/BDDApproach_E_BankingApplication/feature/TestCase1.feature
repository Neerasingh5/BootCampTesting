Scenario: Test case 1: Verify Customer Registration
Given User should open Chrome Browser
When User should enter the E-Banking application URL in browser
Then User should click on Register/Sign Up option
Then User should enter Full Name "Neeraj Singh" into Name field
Then User should enter Email "neeraj@test.com" into Mobile Number/Email field
Then User should enter Account Number "1234567890" into Account Number field
Then User should create Password "Neeraj@123" into Password field
Then User should click on Register button
Then User should verify registration success message is displayed

