@SmokeFeature
Feature: feature to test login functionality

@smoketest
Scenario Outline: Check login is successful with valid credentials

Given browser is open
And user is on login page
When user enter <username> and <password>
And user clicks on login
Then user navigate to the Home page

Examples:
|username|password|
|Raghav  | 12345  |
|Ele     | 12345  |

@smoketest
Scenario Outline: User Login Scenario
Given browser is open
And user is on login page
When user login with following username and password form excel from <rownumber> and <columnumber>
And user clicks on login
Then user navigate to the Home page
Examples:
|rownumber|columnumber|
|1        |2          |
|2        |2          |
|3        |2          |
|4        |2          |
|5        |2          |