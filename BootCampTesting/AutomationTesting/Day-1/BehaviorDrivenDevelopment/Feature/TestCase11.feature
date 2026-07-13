Scenario: Test case 11: Verify Order Confirmation
Given User should complete payment successfully for amount "₹1,999"
When Order is placed successfully
Then User should verify Order Confirmation page is displayed
Then User should verify unique Order ID is generated
Then User should verify confirmation message is displayed
