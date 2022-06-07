#Author: sandeep@gmail.com

Feature: Login
Scenario: Check the title of the Login Page
Given User is on login page
Then Validate the heading of the page

Scenario: Successful Login with valid credentials
Description: To login, user must have the valid credentials with him
Given User is on login page
When User enters valid username, valid password and clicks login button
Then Hotel Booking page should be displayed

Scenario Outline: Prompt the user to enter the data when he leaves the fields blank
Given User is on login page
When User leaves the username<un> password<pwd> blank
Then Error message should be displayed
Examples:
|un|pwd|
|"Neelima"|""|
|""|"neel1234"|
|""|""|

Scenario Outline: Failure in logging in on entering invalid credentials
Given User is on login page
When User enters invalid input in username<uname> password<pswd>
Then Alert message should be displayed
Examples:
|uname|pswd|
|"abc"|"neel1234"|
|"abc"|"abcv"|


