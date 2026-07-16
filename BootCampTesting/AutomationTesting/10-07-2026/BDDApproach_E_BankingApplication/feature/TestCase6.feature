Scenario: Test case 6: Verify Add Beneficiary
Given User should be logged into the E-Banking application
When User should click on Add Beneficiary option
Then User should enter Beneficiary Name "Ramesh yadav" into Beneficiary Name field
Then User should enter Beneficiary Account Number "9876543210" into Account Number field
Then User should enter IFSC Code "SBIN0001234" into IFSC field
Then User should click on Add button
Then User should enter valid OTP for confirmation
Then User should verify Beneficiary added successfully message is displayed
