Feature: my validation on webdemoshop


Scenario: user access to register on website
Given Webdemoshop home page is launched
And User clicks on the Register link
When User enters valid input fields
Then user clicks on the register button


Scenario: user access to LogIn
Given Webdemoshop register page is loaded
And user clicks on the LogIn link
When user enters the credentials
Then user clicks on the logIn button


Scenario: user access to search item
Given user is logged in
When user enters the item to be searched
Then user clicks on the search button


Scenario: user adds the item to the cart
Given item is displayed
When user clicks on the add to cart button
Then item gets added on the cart


 
