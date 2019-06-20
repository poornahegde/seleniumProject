Feature: Login Feauture File
Scenario: A valid login Scenario
Given The url of demoweb shop
When User enters "askmail@email.com" as username
And user enters "abc123" as password
Then User is in valid page