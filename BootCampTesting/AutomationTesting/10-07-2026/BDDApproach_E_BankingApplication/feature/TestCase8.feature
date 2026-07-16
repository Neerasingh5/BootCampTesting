Scenario: Test case 8: Verify Transaction History
Given User should be logged into the E-Banking application
When User should click on Transaction History option
Then User should select Date Range from "01-06-2026" to "10-07-2026"
Then User should click on Search button
Then User should verify all transactions within the date range are displayed
