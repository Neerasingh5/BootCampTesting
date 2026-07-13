Scenario: Test case 8: Verify Wishlist
Given User should be logged into Flipkart
When User should open Product Details page for "Puma Shoes"
Then User should click on Wishlist icon
Then User should open Wishlist page
Then User should verify product "Puma Shoes" is displayed in Wishlist
