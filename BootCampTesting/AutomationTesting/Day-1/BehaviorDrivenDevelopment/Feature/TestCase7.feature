Scenario: Test case 7: Verify Remove from Cart
Given User should have product "Boat Rockerz 450" in Cart
When User should open Cart page
Then User should click on Remove button
Then User should confirm removal
Then User should verify product "Boat Rockerz 450" is removed from Cart
