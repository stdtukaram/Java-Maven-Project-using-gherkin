
Feature: Login function
 This login function deals with the login functionality of aplication

	Scenario: Test login with valid credential
		Given Open the chrome and start the application
		When I enter valid username and password
		Then User should be able to login successfully
	