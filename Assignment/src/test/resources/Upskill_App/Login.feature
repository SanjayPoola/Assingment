
Feature: Test Sign up and send functionality

Scenario: To validate Sign up Option

Given login page of upskill application should be  open
When verify the home page language is English
And Click on Signup link
Then Registration page/form gets displayed


Scenario: To validation registration page

Given login to registration page form
When Enter the firstname "Test1"
And Enter the lastname "Test1"
And Enter email id "Test1@gmail.com"
And Enter username "Testing"
And Enter password "Testing"
And Enter confirm password
And Click on Registration button
Then Confirmation message gets displayed 

Scenario: To validate user details

Given validate user details in home page
When  verify user entered email is correct
Then confirm user details

Scenario: To validate compose send the email

Given Click on Home page
When Click on Compose link from left side menu
And Enter email id as "naveen1@naveen1.com"
And Enter subject as "Hi for testing"
And Enter message as "Hello Naveen, This is for Testing From, Naveen1"
And Click on Send Message
Then Acknowledge message gets displayed "The message has been sent to naveen naveen (naveen)"
