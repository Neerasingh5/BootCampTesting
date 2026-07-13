Scenario: Test case 10: Verify Payment
Given User should be on Payment page
When User should select "UPI" as Payment Method
Then User should enter valid UPI ID
Then User should click on Pay Now button
Then User should verify "Payment Successful" message is displayed for amount "₹1,999"
