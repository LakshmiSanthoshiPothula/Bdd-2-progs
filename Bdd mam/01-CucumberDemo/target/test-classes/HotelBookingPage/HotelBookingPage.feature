#Author:
@HotelBookingForm

Feature: SignUp
Background: User should be logged into login page
And User is on Signup page

Scenario: check the heading of the Sign up page
Given User should be logged into login page
And User is on Sign page
Then check the heading of the page 

Scenario: Successful Signup with valid data
Description: to signup, user should enter his data in mandatory fields
Given User should be logged into login page 
And User is on Signup page
When User enter the data in all mandatory fields
Then navigate to booking successful page

Scenario: Unsuccessful Signup with invalid data
Description: unsuccessful signup, if the user leaves all mandatory fields and click to signup
Given User should be logged into login page 
And  User is on Signup page
When User left the data in all mandatory fields as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving first name field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields
But left first name field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving last name field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields
But left last name field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving email field
Given User should be logged into login page 
And User is on Signup page
When User enter data in all mandatory fields
But left email field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up with invalid email format
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But given other data in email field instead of email format
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving Mobile number field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left mobile number field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up without selecting city drop down
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields
But left  city drop down as unselected
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up without selecting State drop down
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields
But left  State drop down as unselected
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up without selecting number of guests staying drop down
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left selecting number of guests staying drop down as unselected
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up with invalid mobile number format
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields
But given other data in mobile number field instead of valid mobile number
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up with invalid length of the mobile number
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But mobile number with invalid length
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving Card holder name field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left Card holder field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving Debit card number field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left Debid card number field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving CVV field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left Cvv field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving Expiration month field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left Expiration month field as blank
Then navigate to the same page with appropriate error message

Scenario: Unsuccessful signup due to signing up leaving Expiration Year field
Given User should be logged into login page 
And  User is on Signup page
When User enter data in all mandatory fields 
But left Expiration Year field as blank
Then navigate to the same page with appropriate error message












