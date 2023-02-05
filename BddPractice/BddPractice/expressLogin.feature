Feature: verify login credential
Scenario:  login to express.com using valid credential

Given open browser
And go to express.com
When user input valid userName
And user use valid passWord
And user click login button
Then user should see profilePage