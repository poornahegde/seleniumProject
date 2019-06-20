Feature: Data Driven
Scenario Outline: A valid Login
Given URL of web shop
When user enters <username> as <type> username 
When user enters <password> as password
Then User is in valid  page 
Examples:
|username|password|type|
|ask@gmail.com|abc123|guest|
|ask@ymail.com|xyz345|valid|