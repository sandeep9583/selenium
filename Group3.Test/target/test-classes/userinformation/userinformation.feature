#Author: sandeep@gmail.com

Feature: userinformation

Scenario: check the title
Given user is on userinformation page
Then validate page title

Scenario Outline: Failure in user information due to blank value in mandatory fields
Given user is on userinformation page
#When user leaves any mandatory field blank<an><fn><ln><ftn><dob><g><mo><em><lnn><com><ra>
When user enter applicant name <an>
When user enter first name <fn>
When user enter last name <ln>
When user enter father name <ftn>
When user enter date of birth <dob>
When user enter gender <g>
When user enter mobile <mo>
When user enter email <em>  
When user enter landline <lnn>
When user enter communication <com>
When user enter residence address <ra>
And user clicks the Submit btn
#Then display suitable alert msg
Examples:
|an|fn|ln|ftn|dob|g|mo|em|lnn|com|ra|
|""|""|""|""|""|""|""|""|""|""|""|
|"sandeep"|""|""|""|""|""|""|""|""|""|""|
|"sandeep"|"sandeep"|""|""|""|""|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|""|""|""|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|""|""|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|""|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27/01/2001"|""|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|""|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|"9234567891"|""|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|"9234567891"|"sandeep@gmail.com"|""|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|"9234567891"|"sandeep@gmail.com"|"9234567891"|""|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|"9234567891"|"sandeep@gmail.com"|"9234567891"|"Office"|""|
|"sandeep"|"sandeep"|"B"|"janardhan"|"27-01-2001"|"M"|"9234567891"|"sandeep@gmail.com"|"9234567891"|"Office"|"my address"|