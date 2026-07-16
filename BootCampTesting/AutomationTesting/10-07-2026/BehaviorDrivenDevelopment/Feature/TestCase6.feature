Scenario: Test case 6: Verify Update Cart
Given User should have products in Cart
When User should open Cart page
Then User should increase quantity from "1" to "2"
Then User should verify updated quantity "2" is displayed
Then User should verify total amount is updated
