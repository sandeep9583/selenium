#Author: sandeep@gmail.com
Feature: HotelBooking

Background: User has already logged in with valid credentials and he is navigated to hotel booking page

Scenario: check the title
Given user is on hotelbooking page
Then validate page title

Scenario: successful hotel booking with all valid data
Given user is on hotelbooking page
And user enter all valid data
Then Booking Sucessful page is displayed

#Scenario Outline: Failure in hotel booking due to blank value in mandatory fields
#Given user is on hotelbooking page
#When user leaves any mandatory field blank<fn><ln><email><Mob><chn><db><cvv><M><Y>
#And user clicks the ConfirmBooking btn
#Then display suitable alert msg
#Examples:
#|fn|ln|email|Mob|chn|db|cvv|M|Y|
#|""||""||""||""||""||""||""||""||""|
#|"Aarti"|""||""||""||""||""||""||""||""|
#|"Aarti"|"Kumari"||""||""||""||""||""||""||""|

Scenario: Failure in hotel booking due to leaving firstName blank
Given user is on hotelbooking page
When user leaves firstName blank
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario: Failure in hotel booking due to leaving lastName blank
Given user is on hotelbooking page
When user enters valid data into all previous element and leaves lastName blank
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario: Failure in hotel booking due to entering invalid mail id
Given user is on hotelbooking page
When user enters all valid data
But user enter incorrect email id
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario: Failure in hotel booking due to incorrect MobileNo format
Given user is on hotelbooking page
When user enters all valid data
But user enter incorrect email id
|"0788967894"|
|"67786"|
|"9564675876897"|
|""|
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario: Failure in hotel booking on not selecting the city
Given user is on hotelbooking page
When user enters all valid data
But user doesnot select city
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario: Failure in hotel booking on not selecting the state
Given user is on hotelbooking page
When user enters all valid data
But user doesnot select state
And user clicks the ConfirmBooking btn
Then display suitable alert msg

Scenario Outline: Validate the number of rooms allocated
Given user is on hotelbooing page
When user selects count of persons<personcount>
Then allocate suitable no. of rooms as per no. of persons<personcount>
Examples:
|personcount|
|2|
|4|
|9|

Scenario: Failure in hotel booking due to leaving Year blank
Given user is on hotelbooking page
When user enters valid data into all previous elements and leaves Year field blank
And user clicks the ConfirmBooking btn
Then display suitable alert msg

