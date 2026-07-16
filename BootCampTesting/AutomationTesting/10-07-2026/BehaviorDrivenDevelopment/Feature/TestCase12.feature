Scenario: Test case 12: Verify Order History
Given User should be logged into Flipkart as "anuj@gmail.com"
When User should navigate to My Orders page
Then User should verify previous orders are displayed
Then User should verify order details and current status are displayed
