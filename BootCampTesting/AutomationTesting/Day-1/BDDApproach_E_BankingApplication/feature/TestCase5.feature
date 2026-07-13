Scenario: Test case 5: Verify Fund Transfer
Given User should be logged into the E-Banking application
When User should click on Fund Transfer option
Then User should select Source Account "1234567890"
Then User should select Beneficiary Account "9876543210"
Then User should enter Transfer Amount "₹5,000"
Then User should click on Transfer button
Then User should enter valid OTP/Transaction PIN
Then User should verify Fund Transfer success message is displayed
