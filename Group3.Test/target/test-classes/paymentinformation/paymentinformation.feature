#Author: sandeep@gmail.com

Feature: paymentinformation

Scenario: check the title
Given user is on paymentinformation page
Then validate page title
Scenario Outline: Failure in payment information due to blank value in mandatory fields
Given user is on paymentinformation page
When user enter card holder name <ch>
When user enter debitcard <dc>
When user enter cvv  <cv>
When user enter month  <mh>
When user enter year <ye>
And user clicks the Submit btn
Examples:
|ch|dc|cv|mh|ye|
|""|""|""|""|""|
|"sandeep"|""|""|""|""|
|"sandeep"|"23456"|""|""|""|
|"sandeep"|"23456"|"123"|""|""|
|"sandeep"|"23456"|"123"|"09"|""|
|"sandeep"|"23456"|"123"|"09"|"22"|