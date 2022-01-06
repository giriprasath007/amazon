Feature: amazon shopping
Scenario: search an item
Given browser lands on amazon home page
When user enters "Samsung Galaxy Z fold3" in searchbox
And click search button
Then search results appear
When user clicks first option from the results
Then browser lands on product page
