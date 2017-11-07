package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberRunner.AbstractMain;

public class GetLoan extends AbstractMain{
	private static String GET_URL = "http://www.zopa.com/";
	private static By GET_LOAN_OPTION= By.cssSelector(".button.button--fullWidth[href='/loans']");
	private static By SELECT_AMOUNT = By.cssSelector(".calculator__amountInput.borrow-amount.amount-input[aria-controls]");
	

	public void inHomePage()  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jyothy.kadi/Documents/AutomationClasses/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get(GET_URL);
		driver.manage().window().maximize();
		    
	} 
	 public void clickOnTheGetZopaLoanOption() {
		 driver.findElement(GET_LOAN_OPTION).click();
		 
		
	}
	 public void selectTheAmountAndTerm() {
		 driver.findElement(SELECT_AMOUNT).sendKeys(arg0);
		 
		
	}
	public void fillpersonnelDetails() {
		
	}
	

}
