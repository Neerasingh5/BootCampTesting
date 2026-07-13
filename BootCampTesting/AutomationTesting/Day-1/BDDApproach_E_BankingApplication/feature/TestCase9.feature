Scenario: Test case 9: Verify Change Password
Given User should be logged into the E-Banking application
When User should navigate to Change Password option
Then User should enter Current Password "Neeraj@123"
Then User should enter New Password "Neeraj@456"
Then User should confirm New Password "Neeraj@456"
Then User should click on Submit button
Then User should verify Password changed successfully message is displayed
