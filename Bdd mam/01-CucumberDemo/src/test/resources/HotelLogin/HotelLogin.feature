#Author:
@HotelBookingLogin

Feature: Login

Scenario: check the heading of the login page
Given User is on login page
Then check the heading of the page 


Scenario: Successful login with valid data
Description: to login, user should enter his valid username and password
Given User is on login page
When User enter the valid username valid password
Then navigate to hotel booking

Scenario: Unsuccessful login due to incorrect username and password
Description: login will be unsuccessful if the user enters invalid username or password
Given User is on login page
When User enter the invalid user name or password
Then navigate to the same page with error message


Scenario: Prompt the user to enter valid data if the user doesn't fill username 
Given User is on login page
When user doesn't fill the user name 
Then Display the appropriate Prompt message

Scenario: Prompt the user to enter valid data if the user doesn't fill password
Given User is on login page
When user doesn't fill the password
Then Display the appropriate Prompt message

Scenario: Prompt the user that the fields should not be blank if the user leaves both the field empty
Given User is on login page
When user doesn't fill both the fields
Then Display the appropriate Prompt message




