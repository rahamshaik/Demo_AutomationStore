Feature: Login 

@Sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://automationteststore.com/" 
	And User enters Email as "rahamshaik84" and Password as "shaheen89@" 
	And Click on Login 
 	Then Page Title should be "My Account" 
	And username is displayed as "Rahamthulla"
 	When User click on Log out link 
	Then Page Title should be "ACCOUNT LOGOUT"
	
	
	

	

	