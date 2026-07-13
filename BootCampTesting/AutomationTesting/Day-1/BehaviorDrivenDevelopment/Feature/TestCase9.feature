Scenario: Test case 9: Verify Checkout
Given User should have products in Cart
When User should click on Place Order button
Then User should select Delivery Address "Greater Noida, UP"
Then User should proceed to Checkout page
Then User should verify Order Summary is displayed
