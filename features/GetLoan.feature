Feature: Get a personalised loan quote  

Scenario Outline: 
	Verify the Get a loan quote page 

	Given I am in home page 
	When I click on the Get a Zopa loan option 
	And I can then select the '<Amount>' and ''<Term>' I want to borrow 
	And I click on get my personalised rate button
	Then I fill in my personnel details 
		|EmailId|Title|Firstname|Lastname|Phone number|DOB|LoanReason|Address|FinancialDetails|Annualincomebeforetax|Doyouownyourhome?|password|
		|jkkadi13@gmail.com|Mr|Rathan|Kumar|07872932355|13/01/1982|car|IG7 5NA|Employed|42000|yes|Test123|
	Examples: 
		|Amount|Term|
		|1000|1 year|
		|5000|2 year|
		|8000|3 year|
		|1000|4 year|
		|3000|5 year|   
		