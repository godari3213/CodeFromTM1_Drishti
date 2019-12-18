Feature: my validation on webdemoshop

Background: Launch the demowebshop
Given App is launched by user

Scenario: user access to register on website
Given User clicks on the Register on home page
When User enters valid data in input fields
Then user clicks on the register


Scenario Outline: user access to LogIn
Given user clicks on the LogIn link on homepage
When user enters the registered username "<uname>"
And user enters the registered password "<pwd>"
Examples:
|uname|pwd|
|drish.dt@gm.com|1234567890|
|mayuri@gmail.com|123456|