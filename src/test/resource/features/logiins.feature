Feature: login

Scenario: Login with Valid credentials
Given user navigate to loginpage
When user provide valid email "madhavipenumatsa19@gmail.com"
And user provide valid password "123456789"
And click on login button
Then user login to the application

Scenario: Login with Invalid credentials
Given  user navigate to loginpage
When  user provide Invalid email "madhavipenuma@gmail.com"
And user provide Invalid password "123456"
And click on login button
Then user should get proper error address

Scenario: Login with validEmail and Invalidpassword credentials
Given user navigate to loginpage
When  user provide Invalid email "madhavipenumatsa19@gmail.com"
And user provide Invalid password "123456"
And click on login button
Then user should get proper error address

Scenario: Login with InvalidEmail and validpassword credentials
Given  user navigate to loginpage
When  user provide Invalid email "madhavipenumats@gmail.com"
And user provide valid password "123456789"
And click on login button
Then user should get proper error address

Scenario: Login with InvalidEmail and validpassword credentials
Given user navigate to loginpage
And click on login button
Then user should get proper error address