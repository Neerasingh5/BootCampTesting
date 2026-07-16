Scenario: Test case 1: Verify Customer Registration
Given User should open Chrome Browser
When User should enter "https://www.flipkart.com" in browser
Then User should click on Sign Up/Register option
Then User should enter Name "Anuj Yadav" into Name field
Then User should enter Email "anuj@gmail.com" into Mobile Number/Email field
Then User should enter Password "Anuj@123" into Password field
Then User should click on Register button
Then User should verify registration success message "Customer account created successfully" is displayed
