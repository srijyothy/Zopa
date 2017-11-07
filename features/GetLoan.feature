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
		
		Scenario Outline:
		Given I visit 'home' page
		And the page title is 'Simple loans & smart investments | Zopa.com'
#		And I like the code
		When I click on 'Get a Zopa loan'
#		And I do something in the code
		Then I should be on 'Zopa loans – See rates & apply online | Zopa.com' page
		When I fill in the amount with '<amount>'
		And I select the '<term>'
		And I click on 'Get my personalised rate button'
		Then I should be on 'Zopa UK Loans - Get a great rate loan from Zopa Investors' page
		When I fill in the following details
		|Email id|jk|
		|Firstname||
		|||
		
		|member_email|jkkadi13@gmail.com|
		|Mr|Rathan|Kumar|
		|07872932355|
		|13/01/1982|
		|car|
		|IG7 5NA|
		|Employed|
		|42000|
		|yes|
		|Test123|
		
		
		
		Examples:
		|amount|term|